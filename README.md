# javaStandard
Java의 정석 3판 학습노트 정리

## 5. 배열 array
### 1. 배열의 복사
   #### 1. for문
      1. 기존 배열 길이 2배
      2. 값 복사
   #### 2. System.arraycopy()
      1. 지정된 범위 값들을 한 번에 통째로 복사
      2. 더욱 효율적

### 2. 배열의 활용
#### 1. 총합과 평균
#### 2. 최대값과 최소값
      1. 첫번째 요소로 최대, 최소를 초기화
#### 3. 섞기(shuffle)
      1. 카드섞기
      2. 로또번호 생성
        - 6개 뽑으므로, 인덱스를 0~5까지 반복하면서 임의의 위치에 있는 값과 자리를 바꾼다.
        - 뽑을 때는, 앞에서부터 6개를 뽑으면 된다.(인덱스 0~5)
