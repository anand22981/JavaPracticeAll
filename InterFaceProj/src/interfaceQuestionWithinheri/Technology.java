package interfaceQuestionWithinheri;

public interface Technology extends Kodnest
{
  void EasyQuestion();
  default void diffQue() {
	  System.out.println("use diff question");
  }
}
