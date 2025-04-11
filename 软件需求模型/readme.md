# 文件夹说明
本文件夹可用于存放软件需求模型，包括：
+ 交互图：顺序图/通信图
+ 类图
+ 状态图  

软件需求模型建立过程如下  

```mermaid
graph LR
    A[初步软件需求] --> B[分析和确定软件需求优先级]
    B --> C[分析和建立软件需求模型]
    C --> D[文档化软件需求]
    D --> E[确认和验证软件需求]
    E --> F[确认和验证后的软件需求模型和文档]
    E --> B[迭代]
```

>[!Tips]
> ### 如何打开.drawio文件？
> 1. 在vscode中下载draw.io插件即可打开  
> https://marketplace.visualstudio.com/items/?itemName=hediet.vscode-drawio
> 2. 网页版drawio  
> https://www.drawio.com  
> start->文件->从...打开

>[!WARNING]
> ### 上传你的贡献
> 在本文件夹下新建一个文件夹，将你的图放入该文件夹下，注意避免做重复的工作