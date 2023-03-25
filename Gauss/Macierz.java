
package Gauss;

import java.util.Random;

public class Macierz 
{
    public int wiersze,kolumny;
    public int [][]tab;


    public Macierz(int wiersze, int kolumny) //macierz bez z góry określone tablicy
    {
        if(wiersze<=0 || kolumny <=0)
        {
            this.wiersze=2;
            this.kolumny=2;
        }
        else
        {
        this.wiersze = wiersze;
        this.kolumny = kolumny;
        }
        tab= new int[this.wiersze][this.kolumny];    
    }
    
    public int getWartosc(int i,int j)
    {
        return this.tab[i][j];
    }
    public void setWartosc(int wartosc,int i,int j)
    {
        this.tab[i][j]=wartosc;
    }
    
    @Override
    public String toString()
    {
       String border="";
       for(int i=0;i<this.wiersze;i++)
       {
           border +="|";
           for(int j=0;j<this.kolumny;j++)
           {
            border = border + " " + this.tab[i][j];  
            
           }
           border +=" |\n";
       }
       return border;
    }
    
    
}
