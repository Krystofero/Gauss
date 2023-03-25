package Gauss;

public class Oblicz 
{
 public static void gauss(Macierz macierz,Macierz wyniki)
    {
        int j=0,i=0,k=0;
        Macierz m_pom = new Macierz(macierz.wiersze,macierz.kolumny);
        for(i=0; i<macierz.wiersze;i++)
        {
            for(j=0; j<macierz.kolumny;j++)
            {
                m_pom.setWartosc(macierz.getWartosc(i, j), i, j);
            }
        }
        Macierz w_pom = new Macierz(wyniki.wiersze,wyniki.kolumny);
        for( i=0; i<wyniki.wiersze;i++)
        {
            for(j=0; j<wyniki.kolumny;j++)
            {
                w_pom.setWartosc(wyniki.getWartosc(i, j), i, j);
            }
        }
        
        //ELIMINACJA 
        
        for(i=0;i<macierz.wiersze;i++)
        {
            for(j=i+1;j<=macierz.kolumny-1;j++)
            {
                for(k=0;k<macierz.wiersze;k++)
                {
                //    a_jk      =   a_jk                -     (     a_ji                /           a_ii   )     *      a_ik
                m_pom.setWartosc((macierz.getWartosc(j,k) - (((macierz.getWartosc(j, i)/macierz.getWartosc(i, i))* macierz.getWartosc(i, k)) )), j, k);
                } 
              
            w_pom.setWartosc((wyniki.getWartosc(j, 0) - (wyniki.getWartosc(i, 0) *(macierz.getWartosc(j, i) / macierz.getWartosc(i, i) ) )), j, 0);
               
            for (int x = 0; x<macierz.wiersze; x++)
            {
                    for (int y = 0; y<macierz.kolumny; y++)
                    {
                        macierz.setWartosc(m_pom.getWartosc(x, y), x, y);
                    }
               wyniki.setWartosc(w_pom.getWartosc(x, 0), x, 0);
            } 
          }
        } 
        
        System.out.print("Macierz po eliminacji:\n"+m_pom + "Wyniki po eliminacji:\n" + w_pom);
        int suma=0,ostatni;
        int[] tabx=  new int[m_pom.wiersze];
        int[] tym= new int  [m_pom.wiersze];
        ostatni=w_pom.getWartosc(w_pom.wiersze-1, w_pom.kolumny-1)/m_pom.getWartosc(m_pom.wiersze-1, m_pom.kolumny-1);
        tabx[m_pom.wiersze-1]=ostatni;
        System.out.println("Rozwiązania układu:");
        System.out.println("x"+(m_pom.wiersze-1)+" = "+ostatni);
        for(i=m_pom.wiersze-2;i>0;i--)
        {
 
                
           tabx[i]=(w_pom.getWartosc(i, 0)- (m_pom.getWartosc(i, i+1)*tabx[i+1])  )/m_pom.getWartosc(i, i);  
           suma +=tabx[i];

           System.out.println("x"+i+" = "+tabx[i]);
        }
        int zerowy =(w_pom.getWartosc(0, 0)- (suma*tabx[1])  )/m_pom.getWartosc(0, 0);
        System.out.println("x0 = "+zerowy);
    
    }    
}

