//Metodo Principal
public static void main(String[]args)throws IOException{
	int N=0, sd=0;
    int opc;
     do{
     	opc = menu();
        switch(opc){
        	case 1: N = leerN();
                    break;
            case 2: if(N>0){
            			sd = sumadigitos(N);
                    }else{
                    	System.out.println("\nPrimero debe ingresar un n�mero");
                    }
                    break;
            case 3: if(N>0){
            		reportar(sd);
                    }else{
                    	System.out.println("\nPrimero debe ingresar un n�mero");
                    }
                    break;
            case 4: terminar();
                    break;
           }
       }while(opc!=4);
}

//Menu
static int menu() throws IOException{
	int opc;
     do{
     	System.out.println("\nMENU");
        System.out.println("\n1.- Ingresar N�mero");
        System.out.println("\n2.- Calcular la Suma de Digitos");
        System.out.println("\n3.- Reportar la Suma de Digitos");
        System.out.println("\n4.- Terminar");
        System.out.print("\nSu opci�n es: ");
        opc = Integer.parseInt(br.readLine());		
     }while(opc<1||opc>4);
     return opc;
} 

//Metodo Leer N(Variable)
static int leerN() throws IOException{
	int N;
     do{
     	System.out.print("Ingrese N�mero: ");
        N = Integer.parseInt(br.readLine());
     }while(N<=0);
     return N;
}

//Metodo terminar 
static void terminar() throws IOException{
	System.out.println("\nPrograma Finalizado... Vuelva pronto..!!!");
    return;
}

//Reportar Variable
static void reportar(int X)throws IOException{
	System.out.println("\nLa suma de d�gitos es de "+sd);
 	return;
}

//Reportar Variable-Mensaje
static void reportar(int X, String Y) throws IOException{
	System.out.println(Y + X);
    return;
}

//Metodo de Suma de Digitos
static int sumadigitos(int X) throws IOException{
	int res, coc, suma=0;
     while(N>0){
     	res = N%10;
        suma = suma + res;
        coc = N/10;
        N = coc;
     }
    return suma;
}

//Metodo Minimo Com�n Multiplo
static int minimocomun(int X, int Y) throws IOException{
	int d=2, mcm=1;
    while(N1>1 || N2>1){
    	if(N1%d==0 || N2%d==0){
    		if(N1%d==0){
    			N1 = N1/d;
           	}
          	if(N2%d==0){
          		N2 = N2/d;
           	}
          	mcm = mcm*d;
        }else{
        	d = d+1;
        }
    }
   return mcm;
}

//Metodo Potencia
static int potencia(int X, int Y) throws IOException{
	int c, pot=1;
     for(c=1;c<=N2;c++){
     	pot = pot*N1;
     }       
    return pot;
}

//Metodo Numero Primo
static String numeprimo(int X) throws IOException{
    int c, cd=0;
    String rep;
   for(c=1;c<=N;c++){
       if(N%c==0){
           cd++;
      }
   }
   if(cd<=2){
       rep="\nEl n�mero si es primo";
   }else{
       rep="\nEl n�mero no es primo";
   }       
   return rep;
}

//Metodo Repunit
static String repunit(int N) throws IOException{
    int res,uno=0,cdig=0,coc;
    String rep;
    while(N>0){
        res=N%10;
        cdig++;
        if(res==1){
          uno++;
      }
        coc=N/10;
        N=coc;
    }
    if(cdig==uno){
      rep="\nEl n�mero si es repunit";
  }else{
      rep="\nEl n�mero no es repunit";
  }
return rep;
}

//Metodo Producto (Suma sucesivas)
static int producto(int X, int Y) throws IOException{
	int c, prod=0;
     for(c=1;c<=N2;c++){
     	prod = prod+N1;
     }     
     return prod;
}

//Metodo Calcular Factorial
static int factorial(int X)throws IOException{
	int c,fac=1;
	for(c=1; c<=X; c++){
		fac=fac*c;
	}
	return fac;
}

//Metodo Cantidad de Digitos
static int cantdigitos(int X) throws IOException{
	int res, cdig=0, coc;
     while(N>0){
     	res = N%10;
        cdig++;
        coc = N/10;
        N = coc;
     }
    return cdig;
}

//Metodo escribir n�mero al rev�s
static int invertido(int X) throws IOException{
	int ninv=0, res;
    while(X>0){
    	res = X%10;
        ninv = ninv*10+res;
        X = X/10;        
    }
    return ninv;
}

//Metodo Factores Primos
static int facprimos(int N) throws IOException{
	int p, d=2;
    System.out.println("\nLos factores primos de "+N+" son ");	   	
	while(N>1){
		p = N%d;
	    if(p==0){
	    	System.out.print("\t"+d);	
	        N = N/d;
	    }else{
	    	d = d+1;
	    } 
     }
     return d;  
}

//Metodo MCD  
static int maximocomun(int N1, int N2) throws IOException{
	int d=2, mcd=1;
    while(d<=N1 && d<=N2){
    	if(N1%d==0 && N2%d==0){
    		N1 = N1/d;
		    N2 = N2/d;
		    mcd = mcd*d;	
		}else{
			d = d+1;
		}
	}
	return mcd; 
}

//Metodo N�mero Perfecto - Abundante sum>N
static String perfecto(int N) throws IOException{
	int c, sd=0;
	String rep;
    for(c=1;c<N;c++){
    	if(N%c==0){
    		sd = sd + c;
        }
     }
     if(sd==N){
     	rep="\nSi es un numero perfecto";
     }else{
     	rep="\nNo es un numero perfecto";
     }
     return rep;
}

//Metodo Numero Malvado
static String malvado(int N) throws IOException{
    int Nb=0, res, b=1, k=0,nBin=0, uno=0;
    String rep;
    while(N>0){
        res=N%2;
        if(res==0 && k==0){
            b=b*10;
        }else{
            k=1;
        }
        Nb=Nb*10+res;
        N=N/2;
    }
    while(Nb>0){
        res=Nb%10;
        if(res==1){
            uno++;
        }
        nBin=nBin*10+res;
        Nb=Nb/10;
    }
    nBin=nBin*b;
    if(uno>=2){
        rep="Es un numero malvado";
    }else{
        rep="No es un numero malvado";
    }
return rep;
}

//Main Con validacion continuar
public static void main(String[]args)throws IOException{
    int N,f;
    char res;
    do{
    N=LeerN();
    f=calcularF(N);
    reportar(N,f);
    res=continuar();
    }while(res=='S');
}
//Continuar
static char continuar() throws IOException{
   	char res;
	do{
		System.out.print("\nDesea Continuar S/N? ");
       	res = br.readLine().toUpperCase().charAt(0);
   	}while(res!='S' && res!='N');
return res;
}

//Divisores
static int calcularD(int N)throws IOException{
    int c,cd=0;
    System.out.println("\nLos divisores de "+N+" son:");
    for(c=1; c<=N; c++){
        if(N%c==0){
            System.out.println("\t"+c);
            cd++;
        }
    }
return cd;
}

//Bolean
if(resp==true){
    fac=calcularF(N);
    reportar(fac,"El factorial es: ");				
}else{
    cd=CantDigitos(N);
    reportar(cd,"Cantidad de digitos es: ");				
}
//Abundante
static boolean Abundante(int N)throws IOException{
    int c,sdiv=0;
    boolean respue;
    for(c=1; c<N; c++){
        if(N%c==0){
            sdiv=sdiv+c;
        }
    }
    if(sdiv>N){
        respue=true;
    }else{
        respue=false;
    }
return respue;
}

//Metodo Suma Divisores Propios
static int sumadivisores(int X) throws IOException{
    int c, sd=0;
   for(c=1;c<N;c++){
    if(N%c==0){
        sd = sd + c;
    }
   }     
   return sd;
}

//Metodo Suma Divisores Propios
static String sumadivisores(int N1, int N2) throws IOException{
    int c,sd1=0,sd2=0;
    String sd;
   for(c=1;c<N1;c++){
    if(N1%c==0){
        sd1 = sd1 + c;
    }
   }
   for(c=1;c<N2;c++){
    if(N2%c==0){
        sd2 = sd2 + c;
    }
   }
   if(sd1==N2 && sd2==N1){
       sd=" son amigos";
   }else{
       sd=" no son amigos";
   }
   return sd;
  }

//Metodo Cantidad Divisores
static int cantidaddivisores(int N) throws IOException{
    int c, cd=0;
   for(c=1;c<=N;c++){
       if(N%c==0){
           cd++;
      }
   }       
   return cd;
  }

  //Metodo Cantidad de Digitos
static String cantidad(int N1, int N2) throws IOException{
    int res,cdig=0,cdig1=0,coc;
    String rep;
    while(N1>0){
        res=N1%10;
        cdig++;
        coc=N1/10;
        N1=coc;
    }
    while(N2>0){
        res=N2%10;
        cdig1++;
        coc=N2/10;
        N2=coc;
    }
    rep=" es "+cdig+" y "+cdig1+" respectivamente";
    return rep;
  }

  //Metodo Cantidad de Digitos
static int cantidad(int N) throws IOException{
    int res,cdig=0,coc;
    while(N>0){
        res=N%10;
        cdig++;
        coc=N/10;
        N=coc;
    }
    return cdig;
  }

  //Metodo Suma de Digitos
static int sumadigitos(int N) throws IOException{
    int res,sum=0,coc;
    while(N>0){
        res=N%10;
        sum=sum+res;
        coc=N/10;
        N=coc;
    }
    return sum;
  }

  //Metodo Capiua
static String capicua(int N) throws IOException{
    int Ninv=0,M,res;
    String msg;
    M=N;
  while(N>0){
      res=N%10;
      Ninv=Ninv*10+res;
      N=N/10;    	
  }
  if(Ninv==M){
      msg=" si es capicua";
  }else{
      msg=" no es capicua";
  }
return msg;
}

//Metodo Repunit
static String repunit(int N) throws IOException{
    int res,uno=0,cdig=0,coc;
    String ms;
    while(N>0){
        res=N%10;
        cdig++;
        if(res==1){
          uno++;
      }
        coc=N/10;
        N=coc;
    }
    if(cdig==uno){
      ms=" si es repunit";
  }else{
      ms=" no es repunit";
  }
return ms;
}

//Metodo Factorial (Divisores)

static int CalcularDiv(int N)throws IOException{
	int c,cdiv=0;
	for(c=1; c<=N; c++){
		if(N%c==0){
			System.out.print("\t"+c);
			cdiv++;
		}
	}
	return cdiv;
}