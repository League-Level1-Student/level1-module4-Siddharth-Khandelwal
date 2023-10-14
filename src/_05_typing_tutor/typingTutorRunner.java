package _05_typing_tutor;

import java.util.Random;

public class typingTutorRunner {
public static void main(String[] args) {
	typingTutor tutor = new typingTutor();
	tutor.setup(); 

}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
}
