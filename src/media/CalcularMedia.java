/*
Leia quatro notas, cada um deles com uma casa decimal, correspondentes às quatro
notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para
cada uma destas notas. Mostre esta média acompanhada pela mensagem "Media: ". 
Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado por média.". Se
a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado por média.". Se a
média calculada for um valor entre 5.0 e 6.9, incluindo o próprio 5.0 e 6.9, o programa deve
imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média 
(some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem
"Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha 
ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na
última linha uma mensagem "Media final: " seguido da média final para esse aluno.
*/

package media;
import java.util.Scanner;
 
public class CalcularMedia {
 
    public static void main(String[] args){
 
    //Criação do objeto Scanner	.
    Scanner notas = new Scanner(System.in);
    
    /*Declaração das variáveis:
    1º nota, 2º nota, 3º nota, 4º nota, Média e Nota do Exame Final, respectivamente. */ 
    double n1, n2, n3, n4, media, nExame;
    
    //Recebe primeira nota.
    System.out.println("Digite a nota 1:\n");
    n1 = notas.nextDouble();
    
    //Recebe segunda nota.
    System.out.println("Digite a nota 2:\n");
    n2 = notas.nextDouble();
    
    //Recebe terceira nota.
    System.out.println("Digite a nota 3:\n");
    n3 = notas.nextDouble();
    
    //Recebe quarta nota.
    System.out.println("Digite a nota 3:\n");
    n4 = notas.nextDouble();
    
    //Calcula a média com os determinados pesos.
    media = (n1*2 + n2*3 + n3*4 + n4*1)/10;
    
    //Caso de aluno aprovado por média.
    if(media >= 7.0){
    	
    	//Imprime a média e imprime que o aluno foi aprovado.
        System.out.printf("Media: %.1f\nAluno aprovado por media.\n", media);}
        
    //Caso de aluno em Exame final
    else if(media >= 5.0 && media < 7.0){
    	
    	//Imprime a média e imprime que o aluno está no exame final.
        System.out.printf("Media: %.1f\nAluno em exame.\n", media);
        
        //Recebe a nota do exame final.
        System.out.println("Digite a nota do exame:\n");
        nExame = notas.nextDouble();
        
        //Imprime a nota do exame final.
        System.out.printf("Nota do exame: %.1f\n", nExame);
        
        //Recalcula a média para média após o exame final.
        media = (media + nExame)/2;
        
        //Caso de aluno aprovado.
        if(media >= 5){
           System.out.printf("Aluno aprovado.\nMedia final: %.1f", media);}
        
        //Caso de aluno reprovado.
        else{
           System.out.printf("Aluno reprovado.\nMedia final: %.1f", media);}}
    
    //Caso de aluno reprovado por média.
    else{
        System.out.printf("Media: %.1f\nAluno reprovado por media.\n", media);}
        
    }
 
}