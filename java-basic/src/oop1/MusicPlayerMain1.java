package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int vol = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        vol++;
        System.out.println("음악 플레이어 볼륨: "+ vol);
        vol++;
        System.out.println("음악 플레이어 볼륨: "+ vol);
        vol--;
        System.out.println("음악 플레이어 볼륨: "+ vol);

        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + vol);
        } else {
            System.out.println(("음악 플레이어 OFF"));
        }

        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
