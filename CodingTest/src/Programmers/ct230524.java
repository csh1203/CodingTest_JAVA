package Programmers;

class ct230524 { //접두사인지 확인하기
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(int i = 1;i < my_string.length(); i++){
            if(my_string.substring(0, i).equals(is_prefix)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
