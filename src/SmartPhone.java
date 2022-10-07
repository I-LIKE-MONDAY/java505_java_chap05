public class SmartPhone extends Phone{  // Phone 클래스를 상속받아 사용
    public SmartPhone(String owner) {
        super(owner);   // 부모클래스 Phone에 owner 대입 -> 본인의 멤버변수 owner로 저장
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }



}
