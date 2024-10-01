package aluno;

public class media {
    int nota1;
    int nota2;

    public void media(int nota1, int nota2){
        float media= (float)  (nota1 + nota2)/2;
        System.out.println("Sua media e igual á: " + media);
    }
}
