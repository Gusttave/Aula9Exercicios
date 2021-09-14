package Aluno;

public class Aluno{
    String nome, disciplina;
    double n1, n2, n3, n4, frequencia;

    public void setNome(String nome){
        this.nome = nome;

    }
    public class Aluno{
        String nome, disciplina;
        double n1, n2, n3, n4, frequencia;
        
        public void setNome(String nome){
            this.nome = nome;
        }
        public String getNome(){
            return this.nome;
        }
        public void setDisciplina(String disciplina){
            this.disciplina = disciplina;
        }
        public String getDisciplina(){
            return this.disciplina;
        }
        public void setN1(double n1){
            this.n1 = n1;
        }
        public double getn1(){
            return this.n1;
        }
        piblic void setN2( double n2){
            this.n2 = n2;
        }
        public double getN2(){
            return this.n2;
        }
        public void setN3(double){
            this.n3 = n3;
        }
        public double getN3;(){
            return this.n3;
        }
        public void setFrequencia(double frequencia){
            this.frequencia = frequencia;
        }
        public double getFrequencia(){
            return this.frequencia;
        }
        public String mediaAprovado(){
            String resultado;
            double media;
            
            media = (n1 + n2 + n3) /3);

            if(this.frequencia >= 75 && media >=6){
                resultado = "O aluno" + this.nome + "está APROVADO!" + "\n" + 
                            "na disciplina de" + disciplina;
            } else{
                resultado = "O aluno" + this.nome + "está REPROVADO!" + "\n" +
                "na disciplina de" + disciplina;
            }
            return "A média do aluno é:" + media + "\n" + resultado;

        }
        
     }
    