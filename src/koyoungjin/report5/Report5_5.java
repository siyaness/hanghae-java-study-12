package koyoungjin.report5;
// 문제 6-7
// 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
// 이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
// (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
public class Report5_5 {
}
class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    static int weapon = 6; //공격력
    static int armor = 0; //방어력
    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
    weapon, armor
    ㄴ모든 마린의 공격력과 방어력은 같아야 함

    armorUp, weaponUp
    ㄴ weapon, armor 가 static 이기 때문에 업글도 static으로 해줘야함


     */
}