### Git操作规范

1. **克隆项目到本地**

   - 使用SSH密钥方式克隆项目：

   ```bash
   git clone git@github.com:Ethan-Zhengsy/Software_Project.git
   ```

   - 确保已配置SSH密钥，如未配置请参考GitHub官方文档或者gpt进行配置
2. **拉取最新内容**

   - 在开始工作前，请先拉取最新内容以避免冲突：

   ```bash
   git pull
   ```
3. **分支管理**

   - 本项目采用以下分支管理策略：

     - `main`分支：项目的主分支，保存稳定可发布的版本
     - `dev`分支：开发分支，团队成员的日常开发工作在此分支进行
     - `feature/功能名`分支：从dev分支创建，用于开发新功能
     - `bugfix/问题描述`分支：从dev分支创建，用于修复bug
     - `docs`分支：用于更新文档
   - 分支工作流程：

     1. 从dev分支创建功能分支或修复分支
     2. 在相应分支上进行开发
     3. 完成后通过Pull Request合并回dev分支
     4. 定期将dev分支合并到main分支发布新版本
   - 查看当前所在分支：

   ```bash
   git branch
   ```

   - 创建并切换到新分支：

   ```bash
   # 创建并切换到feature分支
   git checkout -b feature/登录功能

   # 创建并切换到bugfix分支
   git checkout -b bugfix/修复登录问题
   ```

   - 切换到已有分支：

   ```bash
   # 切换到dev分支
   git checkout dev

   # 切换到main分支
   git checkout main
   ```

   - 推送到远程仓库：

   ```bash
   # 首次推送新分支
   git push -u origin 分支名

   # 后续推送
   git push
   ```

   - 合并分支：

   ```bash
   # 将feature分支合并到dev分支
   # 先切换到dev分支
   git checkout dev

   # 然后合并feature分支
   git merge feature/登录功能
   ```
4. **工作流程建议**

   - 开始新工作前先拉取最新代码 `git pull`
   - 根据任务类型创建对应分支
   - 在分支上进行开发并频繁提交
   - 完成工作后推送到远程并创建Pull Request
   - 团队成员审核代码后合并
5. **实际操作示例**

   - **示例1：开发新功能**

   ```bash
   # 确保当前在dev分支并更新代码
   git checkout dev
   git pull

   # 创建新功能分支
   git checkout -b feature/家教匹配算法

   # 进行开发...
   # [编写代码]

   # 添加并提交更改
   git add .
   git commit -m "实现家教匹配算法的基础框架"

   # 继续开发...
   # [编写更多代码]

   # 再次提交
   git add .
   git commit -m "完成匹配算法核心逻辑"

   # 推送到远程仓库
   git push -u origin feature/家教匹配算法

   # 在GitHub上创建Pull Request，请求合并到dev分支
   # 团队成员审核后合并
   ```

   - **示例2：修复bug**

   ```bash
   # 切换到dev分支并更新
   git checkout dev
   git pull

   # 创建bug修复分支
   git checkout -b bugfix/修复登录验证问题

   # 修复bug
   # [修改代码]

   # 提交修复
   git add .
   git commit -m "修复用户登录验证逻辑错误"

   # 推送到远程
   git push -u origin bugfix/修复登录验证问题

   # 创建Pull Request请求合并
   ```

   - **示例3：更新文档**

   ```bash
   # 切换到docs分支
   git checkout docs

   git pull

   # 更新文档
   # [编辑文档]

   # 提交更改
   git add .
   git commit -m "更新API文档和用户指南"

   # 推送更改
   git push -u origin docs

   # 创建Pull Request到dev分支
   ```

   - **示例4：版本发布**

   ```bash
   # 切换到dev分支确保最新
   git checkout dev
   git pull

   # 切换到main分支并更新
   git checkout main
   git pull

   # 合并dev到main
   git merge dev

   # 解决可能的冲突
   # [解决冲突]

   # 添加版本标签
   git tag -a v1.0.0 -m "第一个正式版本"

   # 推送main分支和标签
   git push
   git push --tags
   ```

#### 项目背景：

1. 目前 家教中介费昂贵。具体而言，可能中介费需要前两次课的收入。这对于希望通过 家教来改善生活的同学是一笔不小的支出。
2. 当前的家教平台并不能很好的适配家长和家教老师双方的要求。对于家教老师而言，如果家教老师多次试课都没能接到合适的家教单的话，无疑浪费了很多时间和精力。对于家长而言，如果多次寻找都没给孩子找到合适的老师的话，也会极大的耽误孩子的学习进程。
3. 家教信息需要自己检索，效率低。无论是家长还是家教老师，在寻找家教信息时，都必须手动检索，人工判别，效率很低。

#### 项目初步想法：

1. 对于家教老师：能够提前把自己的简历和讲课视频上传供家长选择。而家教老师也可以通过平台提供的自动检索功能（比如按照时薪、科目、路程等检索）来自行缩检索范围
2. 对于家长：能够把想要寻求的家教信息上传到平台公共家教老师选择。而家长也能通过平台提供的自动检索功能（比如按照时薪、科目、家教经验等检索）来缩减检索范围。
3. 平台还具有推荐功能，可以按照双方的需求，自动推荐的一些比较好的选择。

> [!tip]
>
> + 可以由家教老师上传有关自己授课的资料、简历和自述等，调用AI分析得到有关老师授课特征的向量
> + 学生及家长选择标签（或上传要求，经AI分析）得到有关学生的成绩、需要的科目、性格等，形成有关学生特征的向量
> + 通过匹配的算法将老师和学生的向量映射到同一片空间，计算向量间的距离，根据距离推荐合适的家教老师

## 项目注意事项

### 项目结构

1. 建议在每个文件夹下（尤其是前期准备存画图的这种文件夹）建立readme文件，备注文件夹下的主要文件的内容，功能，因为有时候看几个字的文件夹名称无法清晰理解别人的文件内容
2. 建议上传时如果可以导出png文件，则在目录里同时存一个图片

## 其他

> [!IMPORTANT]
> 开始搬砖前，记得先拉取远程仓库防止出现冲突  
> 新的工作及时上传

> [!NOTE]

> [!TIP]
>
> 提出自己的想法

> [!WARNING]

> [!CAUTION]
