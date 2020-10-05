package planificadordisco;

public class Lista {
    protected Nodo inicio, fin;
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void agregarFinal(int peticion, int tll){
        Nodo n = new Nodo (peticion, tll);
        if(!estaVacia()){
            fin.siguiente = n; 
            n.anterior = fin;
            fin = fin.siguiente;
        }else{
            inicio = fin = n;
        }
    }
    
    public void eliminarTodo(){
        inicio = fin = null;
    }
    
    public int total(){
        int cont = 0;
        Nodo aux = inicio;
        while (aux!= null ){
            aux=aux.siguiente;
            cont++;
        }
        return cont;
    }
    
    public Nodo retNodo(int n){
        Nodo aux = inicio;
        for(int i=0; i<n; i++){
            aux=aux.siguiente;
        }
        return aux;
    }
    
    public Nodo retNodoPrimero(){
        return inicio;
    }
    
    public void SSTF(int cabezal, Lista listAux){
        int dist,minDist;
        int tBusq  = 0;
        for(int i=0;i<total();i++){
            Nodo menor = inicio;        
            Nodo aux = inicio;
            minDist = 500;
            while(aux != null){
                if(aux.peticion >= cabezal && aux.estado == false){
                    dist = aux.peticion - cabezal;
                    if(dist < minDist){
                        minDist = dist;
                        menor = aux;
                    }
                }else{
                    if(aux.estado == false){
                        dist = cabezal-aux.peticion;
                        if(dist < minDist){
                          minDist = dist;
                          menor = aux;
                        }
                    }
                }
                aux = aux.siguiente;
            }
            menor.TR = minDist;
            tBusq += menor.TR;
            menor.TB = tBusq;
            menor.estado=true;
            cabezal = menor.peticion;
            listAux.agregarFinal(menor.peticion, menor.TLL);
        }
    }
    
    public void SSTF2(int cabezal, double velocidad, Lista listAux){
        Nodo aux = inicio;
        double tEsp;
        double espExtra;
        int tBusq  = 0;
        int rest;
        for(int i=0;i<total();i++){
            tEsp =  (aux.peticion - cabezal)/velocidad;
            if( tEsp < 0 ){
                tEsp = tEsp * -1;
            }            
            if(aux.anterior != null){
                espExtra = aux.anterior.TLL + aux.anterior.TE;
                if(espExtra > aux.TLL){
                    tEsp += (espExtra-aux.TLL);
                    tEsp = (double)Math.round(tEsp * 100d)/100;
                }
            }
            aux.TE = tEsp;
            rest = cabezal - aux.peticion;
            if(rest < 0){
                rest *= -1;
            }
            cabezal = aux.peticion;
            aux.TR = rest;
            tBusq += aux.TR;
            aux.TB = tBusq;
            aux.estado = true;
            cabezal = aux.peticion;
            listAux.agregarFinal(aux.peticion, aux.TLL);
            aux = aux.siguiente;
        }
    }
    
    public void SCAN(int cabezal, int pistInicio, int pistFin, Lista listAux){
        Nodo aux, men=inicio;
        int a, menor;
        int tBusq  = 0;
        for(int j = 0; j<total();j++){
            aux=inicio;
            menor = 500;
            while(aux != null){
                if(aux.peticion > cabezal && aux.estado == false){
                    a = aux.peticion - cabezal;
                    if(a < menor){
                        menor = a;
                        men = aux;
                    }
                }
                aux = aux.siguiente;
            }
            if(men.estado == false){
                men.TR = menor;
                men.estado = true;
                tBusq += men.TR;
                men.TB = tBusq;
                listAux.agregarFinal(men.peticion,men.TLL);
                cabezal = men.peticion;
                Nodo aux2 = inicio;
                while(aux2 != null){
                    if(aux2.peticion == cabezal && aux2.estado == false){
                        aux2.TR = 0;
                        aux2.TB = tBusq;
                        aux2.estado = true;
                        listAux.agregarFinal(aux2.peticion,aux2.TLL);
                    }
                    aux2= aux2.siguiente;
                }
            }
        }        
        cabezal = pistFin - men.peticion;
        cabezal += pistFin;
        listAux.agregarFinal(pistFin, 0);
        men=inicio;
        for(int i=0; i<total();i++){
            aux=inicio;
            menor = 500;
            while(aux != null){
                if(aux.peticion < cabezal && aux.estado == false){
                    a = cabezal - aux.peticion;
                    if(a < menor){
                        menor = a;
                        men = aux;
                    }
                }
                aux = aux.siguiente;
            }
            if(men.estado == false){
                men.TR = menor;
                men.estado = true; 
                tBusq += men.TR;
                men.TB = tBusq;
                listAux.agregarFinal(men.peticion,men.TLL);
                cabezal = men.peticion;
                Nodo aux2 = inicio;
                while(aux2 != null){
                    if(aux2.peticion == cabezal && aux2.estado == false){
                        aux2.TR = 0;
                        aux2.TB = tBusq;
                        aux2.estado = true;
                        listAux.agregarFinal(aux2.peticion,aux2.TLL);
                    }
                    aux2= aux2.siguiente;
                }
            }
        }
    }
    
    public void CLOOK(int cabezal, Lista listAux){
        Nodo aux;
        int cabezalAux = cabezal;
        int min;
        int tBusq  = 0;
        int menor;
        Nodo men = inicio;
        for(int i = 0; i<total();i++){
            aux = inicio;
            menor = 500;
            while(aux != null){
                if(aux.peticion >= cabezal && aux.estado == false){
                    min = aux.peticion-cabezal;
                    if(min < menor){
                        menor = min;
                        men = aux;
                    }
                }
                aux = aux.siguiente;
            }
            if(men.estado == false){
                men.TR = menor;
                tBusq += men.TR;
                men.TB = tBusq;
                men.estado = true;
                cabezal = men.peticion;
                listAux.agregarFinal(men.peticion, men.TLL);
            }
        }
        cabezal = 0;
        listAux.agregarFinal(0,0);
        men = inicio;
        for(int i = 0; i<total();i++){
            menor = 500;
            aux = inicio;
            while(aux != null){
                if(aux.peticion >= cabezal && aux.estado == false){
                     min = aux.peticion;
                     if(min < menor){
                         menor = min;
                         men = aux;
                     }
                }
                aux = aux.siguiente;
            }
            if(men.estado == false){
                men.TR = men.peticion - cabezal;
                cabezal = men.peticion;
                tBusq += men.TR;
                men.TB = tBusq;
                men.estado = true;
                listAux.agregarFinal(men.peticion,men.TLL);
            }
        }
    }
    
    public void CLOOK2(int cabezal, double velocidad, Lista listAux){
        Nodo aux = inicio;
        double tExt;
        double tExt2;
        double mayor;
        int tBusq = 0;
        int rest;
        int limit = cabezal;
        for(int i=0; i<total();i++){
            if(cabezal<aux.peticion){
                if(limit < aux.peticion){
                    limit = aux.peticion;
                }
                aux.TE = (aux.peticion - cabezal)/velocidad;
                cabezal = aux.peticion;
                if(aux.anterior != null){
                    Nodo a = aux.anterior;
                    tExt = a.TLL + a.TE;
                    if(tExt > aux.TLL){
                        aux.TE += (tExt-aux.TLL);
                    }
                }
                aux.TE = (double)Math.round(aux.TE * 100d)/100;
                rest = cabezal - aux.peticion;
                if(rest < 0){
                    rest *= -1;
                }
                aux.TR = rest;
                tBusq += aux.TR;
                aux.TB = tBusq;
                listAux.agregarFinal(aux.peticion, aux.TLL);
                if(limit != aux.peticion){
                    listAux.agregarFinal(limit, 0);
                }
            }else{
                listAux.agregarFinal(0, 0);
                if(aux.anterior != null){
                    mayor =0;
                    aux.TE = 0;
                    Nodo b = aux.anterior;
                    while(b != null){
                        if( b.peticion > mayor){
                            mayor = b.peticion;
                        }
                        b = b.anterior;
                    }
                    if(mayor > cabezal){
                        aux.TE += (mayor-cabezal)/velocidad;
                    }
                    aux.TE += aux.peticion/velocidad;
                    cabezal = aux.peticion;
                    Nodo c = aux.anterior;
                    tExt2 = c.TLL + c.TE;
                    if(tExt2 > aux.TLL){
                        aux.TE += (tExt2-aux.TLL);
                    }
                    aux.TE = (double)Math.round(aux.TE * 100d)/100;
                    rest = cabezal - aux.peticion;
                    if(rest < 0){
                        rest *= -1;
                    }
                    aux.TR = rest;
                    tBusq += aux.TR;
                    aux.TB = tBusq;
                    listAux.agregarFinal(aux.peticion, aux.TLL);
                }
            }
            aux  = aux.siguiente;
        }
    }
}
