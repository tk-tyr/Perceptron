//nu�̒l���ɒ[�Ȓl�ɂ����miss��nu�̎��������܂������Ȃ�
//���̂��ߊw�K�񐔂��������₷���ƂŒl���߂Â��B�l�ɂ���Ă�nu���ϓ����Ȃ����Ƃ�����B

package perceptron;

public class Perceptron_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double nu[] = {0.5, 0.25};
    Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.7);
//�w�K�f�[�^
    double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};
    double output[] = {1, 0, 0, 0};
 //�w�K
          int index;
          for(int i = 0; i < 150; i++){
              index = (int)(Math.random()*4);  //0~3�̗�������
              plib.getParameter(input[index], output[index]);
              System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
          }
          
        //���ʊm�F
          for(int i = 0; i < output.length; i++){
              if(plib.getOutput(input[i]) == output[i])
                  System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
              else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
          }
          System.out.println("Check : nu = "+nu[0]+", "+nu[1]);



	}
}