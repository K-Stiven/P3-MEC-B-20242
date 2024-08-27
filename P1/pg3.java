public static Fraccion sumar(Fraccion f1, Fraccion f2) {
        int numeradorResultado = f1.getNumerador()*f2.getDenominador()+f2.getNumerador()*f1.getDenominador();  //carita feliz
        int denominadorResultado = f1.getDenominador()*f2.getDenominador();                                    //carita feliz
   
        Fraccion resultado = new Fraccion(numeradorResultado, denominadorResultado);
       
        return resultado.simplificar();
    }
    private Fraccion simplificar() {
        int num = num(numerador, denominador); 
        return new Fraccion(numerador / num, denominador / num) ;
        
    }
    private int num(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
