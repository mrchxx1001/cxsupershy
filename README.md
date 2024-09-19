# cxsupershy
LG DX SCHOOL CX 프로젝트에서 사용한 서버 코드입니다. Flask와 Spring Boot를 활용하여 "LG Sync Car" 차량용 대시보드의 프로토타입을 구현하였습니다.

## 👨‍🏫 프로젝트 소개
"초개인화된 차량용 멀티프로필"을 주제로 한 차량용 대시보드입니다. 얼굴인식을 통해 사용자를 등록하고 식별하며, 사용자가 설정한 옵션으로 대시보드를 구성하였습니다.

## ⏲️ 프로젝트 기간 
- 2024.09.05(목) ~ 2024.09.13(금)
- 기획 발표
- 기능 요구사항 정의서, 유스케이스 설계서, ERD 설계
- 와이어 프레임 및 화면 디자인
- 개발
- 발표평가
  
## 🧑‍🤝‍🧑 개발자 소개 
- **김서현**
- **김언지**
- **엄자연**
- **황지훈**
![image](https://github.com/user-attachments/assets/27eeb560-9146-4d07-9cfb-13f118cd3dfb)


## 💻 개발환경
- **Version** : Java 17
- **IDE** : IntelliJ
- **Framework** : SpringBoot 2.7.11
- **ORM** : JPA

## ⚙️ 기술 스택
- **Language** : Python, Java
- **DataBase** : Oracle
- **Front-end** : HTML, CSS, JavaScript
- **Back-end** : Springboot, Flask  
- **Collaboration** : Notion, Figma, GitHub, Google Drive 

## 🏗️ ERD
![image](https://github.com/user-attachments/assets/ff766157-00d3-4157-819c-54eff9c8c017)

## 🌊 프로젝트 전체 플로우
![image](https://github.com/user-attachments/assets/89b28870-ab0b-4363-b34f-5571744a2bdb)


## 📝 프로젝트 아키텍쳐
![image](https://github.com/user-attachments/assets/42bf8014-11c3-402d-ae83-915040c5e832)


## 📌 주요 기능
- YOLOv8
  - 객체탐지(Object Detection) 분야에서 사용되는 딥러닝 모델
  - 다중 객체 탐지 가능
    - 이미지 내에서 여러 객체를 동시에 탐지할 수 있으며, 각 객체의 레이블(예:사람, 강아지 등)와 위치(바운딩 박스 좌표)를 반환함
- Residual Networ(ResNet50)
  - 딥러닝 분야에서 이미지 분류와 특징 추출에 널리 사용되는 모델
  - 특징 추출이 가능함
    - 다양한 이미지에서 유의미한 특징을 추출하는 데 뛰어남
    - 이미지 분류, 물체 탐지 등의 다양한 비전(vision) 작업에서 활용되며, 추출한 특징을 임베딩 벡터로 반환함
 - YOLOv8과 ResNet50을 활용한 고객 인식 Service Flow
  ![image](https://github.com/user-attachments/assets/829cf3b9-bafa-4cec-a7a7-bbc42697a725)
   - 고객 인식 : YOLOv8을 이용해 카메라에 비춰지는 프레임에서 사람을 인식하고, ResNet50으로 고유한 특징을 추출해 임베딩을 생성함
   - 고객 확인 : 추출된 임베딩을 저장된 임베딩과 비교하여 유사도를 계산하여 임계값(0.8)보다 높으면, 기존 고객으로 인식하여 로그인 처리, 그렇지 않으면 새로운 고객으로 등록
- SpringBoot를 활용한 임베딩/로그 데이터 처리
  ![image](https://github.com/user-attachments/assets/ab37af8e-3f61-4710-972c-df265c114224)
  ![image](https://github.com/user-attachments/assets/ccf35912-ec9c-43ef-9bc1-5fec21a1cb89)
  - 카메라 끄기 이벤트가 발생하면 Flask를 통해 임베딩, 로그 데이터 전송
  - post mapping을 통해 이 값을 받은 뒤 respinsbody.ok 사인 반환
    - Flask를 통해 Map<String, Object> 형태로 데이터를 전달 받음
    - embeddings와 logData로 데이터 분할
      - embeddings : 2차원 배열 형태
      - logData : 1차원 배열 형태, 다시 map 형태로 전환
    - logData의 isNewPerson이 true인 경우에만 DB 적재 진행
      - 기존에 입력 받은 값은 session에 저장했다가 Service에서 Users 클래스로 매핑됨
      - Users 클래스 형태로 Repository에서 DB에 저장
  - YOLOv8은 값의 유사도 정도에 따라 적절한 화면 반환
    - 임베딩 값 0.8 이상 (New User) : 회원가입 화면 호출
    - 임베딩 값 0.8 미만 (Existing User) : 대시보드 화면 호출

## 📌 화면 주요 기능
![image](https://github.com/user-attachments/assets/78d270f8-51b5-4b5d-b9b2-83bfbd8a9a69)
- 시작 페이지에서 기존 사용자라면 로그인을 눌러 얼굴인식페이지로 넘어가 인식을 진행한다.
- 처음이라면 새프로필 등록하기를 눌러 닉네임 페이지로 넘어간다.

![image](https://github.com/user-attachments/assets/f0981a82-6fc7-49b7-a566-34d8ababe99f)
![image](https://github.com/user-attachments/assets/ff6a1443-ab75-4196-884c-6af7798ff736)
![image](https://github.com/user-attachments/assets/4c406a28-f458-45d4-b335-6e7fbeac59a9)
![image](https://github.com/user-attachments/assets/b75b2e23-72c4-4f6d-954b-350df1463c9d)
![image](https://github.com/user-attachments/assets/b9a85f34-67de-4153-a14f-1f54415b9530)
- 닉네임 및 아이콘, 관심있는 모드, 시트 높낮이와 온도를 설정하게 되면 프로필 등록이 완료된다.
- 차량에서 사용자가 조정하는 하드웨어의 상태가 화면에 반영되는 것을 구현하기 위해, 자바 스크립트를 통해 방향키로 시트의 각도와 온습도가 조정되도록 구현했다.
- 이후 사용자 맞춤 메인 대시보드를 보여준다.

![image](https://github.com/user-attachments/assets/60bda219-b1ee-4f76-a286-705b9c562efd)
- 메인 대시보드는 사용자가 설정한 정보를 보여주며 사용자의 상태 또한 보여준다.

![image](https://github.com/user-attachments/assets/282e49ab-ab2f-4336-84c3-1d0a3762c5df)
- 카카오 api를 통해 화면을 연결시켜놓았으며 현재위치와 목적지로 길찾기 기능을 구현해 놓았다.

![image](https://github.com/user-attachments/assets/a3825c94-6968-48d8-92d9-ecee57413646)
![image](https://github.com/user-attachments/assets/d58a6ae5-ed50-4f85-ba0e-afad58a7fd2b)
- 오른쪽상단에는 여러 사용자를 위한 프로필 전환 기능을 구현해 놓았다.
- 휴식모드를 통해 조명 밝기 조절, 소음모드, ASMR모드를 조절할 수 있는 화면을 구현했다.
      
