CNN 인공지능 딥러닝 모델을 활용한 웹 쇼핑몰
=================================================

>서비스 링크(http://springboot-developer-env-1.eba-9jw9shh8.ap-northeast-2.elasticbeanstalk.com/upload) 

Main 페이지
-------------
![Untitled](https://github.com/Kim-soung-won/Drink-labeling/assets/105148570/dfaf8760-3eb7-4e06-b7cd-076eb1fbea79)

### 📱구현 의도
> 이미지 검색이 텍스트 검색 만큼 검색 의도, 사용자 목적에 맞는 정보를 제공한다면 어떨까?  
* 이미지 검색은 다양한 포털에서 사용되지만 그 결과를 바탕으로 사용자가 원하는 '진짜 정보'를 얻을 수는 없다.
* 사용자가 원하는 진짜 정보를 얻기 위해서는 라벨링 결과를 통해 추가적인 검색 과정이 필요하다.
* 만약 대규모 포털이 아닌 소규모 포털에서 이미지 검색 기능을 제공한다면 검색 범위는 작더라도 사용자가 원하는 정보를 바로 출력해보일 수 있지 않을까?
* 이미지 라벨링을 위한 CNN 모델을 '음료'만 학습하여 음료 전문 쇼핑몰에 적재함으로서 검색 기능으로 사용할 수 있다.
* 검색의 결과물 또한 '음료'로 정해져 있기 때문에 음료에 대한 데이터만 준비되어있다면 한번의 검색으로 음료에 대한 데이터들을 찾아볼 수 있다.
* 구현한 서비스는 열량과 영양소 데이터를 기본으로 판매를 위한 가격 데이터까지 준비하였다.


✔️ **주요 기능**

·  음료 및 가격 CRUD 기능

·  데이터 전달을 위한 REST API 구현

·  OAuth 소셜 로그인 기능

·  JWT 사용자 인증 기능

·  REST API를 통한 Token, 인증 관리

·  Tensorflow를 활용한 CNN모델 learning,구현

·  Tensorflow.js로 변환 및 프론트엔드 적재

·  CNN 모델을 이용한 라벨링 기능

·  라벨링 결과, 유저 상호작용을 통한 데이터 출력 기능

· PortOne API를 이용한 간편 결제(카카오페이) 기능


### 💼프로젝트 산출물
✔️ **프로젝트 산출물** 

[산출물.pdf](https://prod-files-secure.s3.us-west-2.amazonaws.com/db817909-074d-4c90-92e8-b4cf9f841230/ab1467b2-2c2f-48e3-a368-b6fcda34294c/%EC%82%B0%EC%B6%9C%EB%AC%BC.pdf)


### 문제 해결 부분
1. JWT와 연계된 마이페이지(개인정보 출력)
2. CNN 모델 웹 페이지 적재 방법
3. OAuth2 회원가입 시 상세정보 추가 입력
4. OAuth2 Naver API가 제공해주는 유저 json형식이 Google, Meta와 일치하지 않음