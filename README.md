# Spring Boot Prototype Project

這是一個使用 Spring Boot 建立的原型專案，專為不同環境配置和 Docker 部署而設計。

## 目錄

- [專案結構](#專案結構)
- [環境要求](#環境要求)
- [安裝步驟](#安裝步驟)
- [使用方法](#使用方法)
- [部署](#部署)
- [常用指令](#常用指令)
- [貢獻方式](#貢獻方式)
- [版本控制](#版本控制)
- [作者](#作者)
- [授權](#授權)

## 專案結構

```
.
├── config/
│   ├── dev/
│   │   └── .env
│   ├── staging/
│   │   └── .env
│   └── prod/
│       └── .env
├── docker/
│   ├── basic/
│   │   └── java/
│   │       └── dockerfile
│   ├── dev/
│   │   └── docker-compose.yml
│   ├── staging/
│   │   └── docker-compose.yml
│   └── prod/
│       └── docker-compose.yml
├── src/
│   └── main/
│       ├── java/
│       └── resources/
├── .gitignore
├── pom.xml
└── README.md
```

## 環境要求

- JDK 17+
- Maven 3.6+
- Docker
- Docker Compose

## 安裝步驟

1. 克隆儲存庫：
   ```
   git clone https://github.com/yourusername/springboot-proto.git
   ```

2. 進入專案目錄：
   ```
   cd springboot-proto
   ```

3. 安裝 Maven 依賴：
   ```
   mvn clean install
   ```

## 使用方法

### 本地運行

1. 設置環境變數：
   ```
   cp config/dev/.env.example config/dev/.env
   ```
   編輯 `.env` 文件設置所需的環境變數。

2. 啟動應用：
   ```
   mvn spring-boot:run
   ```

### 使用 Docker

1. 構建 Docker 映像：
   ```
   docker build -f docker/basic/java/dockerfile -t springboot-proto:latest .
   ```

2. 運行 Docker 容器：
   ```
   docker-compose -f docker/dev/docker-compose.yml up
   ```

## 部署

### 開發環境

```
docker-compose -f docker/dev/docker-compose.yml up -d
```

### 生產環境

在 Kubernetes 中部署時，請確保將 `.env` 文件中的環境變數轉換為 Kubernetes Secrets。

## 常用指令

- 查看專案結構：
  ```
  tree /F /A | findstr /V "README"
  ```

- 運行測試：
  ```
  mvn test
  ```

- 檢查程式碼風格：
  ```
  mvn checkstyle:check
  ```

## 貢獻方式

1. Fork 本專案
2. 創建您的特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交您的修改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 開啟一個 Pull Request

## 版本控制

該專案使用 [SemVer](http://semver.org/) 進行版本管理。可用版本請參閱 [tags on this repository](https://github.com/yourusername/springboot-proto/tags)。

## 作者

* **Your Name** - *Initial work* - [YourUsername](https://github.com/YourUsername)

查看其他 [contributors](https://github.com/yourusername/springboot-proto/contributors) 參與本專案。

## 授權

本專案採用 MIT 授權 - 查看 [LICENSE.md](LICENSE.md) 了解詳情