
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/**
 * akolouthei i klassh sierpinski, opou perilamvanetai o domitis sierpinski, mesa ston opoio orizontai kapoia "emfanisiaka" xaraktiristika tou 
 * antikeimenou afths ths klashs.Akomh, dimiourgountai dyo koumpia tis klashs JButton, kai fysika o
 * antistoixos akroaths(ths klashs WindowDestroyer).Epiprostheta,anaforika me tin klassi sierpinski pragmatopoieitai h diasindesi 
 * ActionListener
 */

public class sierpinski extends JFrame implements ActionListener
{

public static final int WIDTH=600;
public static final int HEIGTH=600;

JPanel panel1 = new JPanel();

public  int counter=0;




double[] A=new double[2];
double[] B=new double[2];
double[] C=new double[2];



double x;
int y,y1,i;
double[] trexon=new double[2];
double[] proorismou=new double[2];
double[] mid=new double[2];



/**akolouthei o apairaititos domitis, pou ws gnwston, exei rolo "arxikopoiisis" kapoiwn xaraktiristikwn, opws
 * p.x. to xrwma, 
 * 
 */
public sierpinski()
{
    super();
    
    setSize(WIDTH,HEIGTH);
    
    Container contentPane = getContentPane();
    
    setTitle("SIERPINSKI TRIANGE");
    contentPane.setBackground(Color.cyan);
    
    WindowDestroyer listener1= new WindowDestroyer();
    addWindowListener(listener1);
    
    contentPane.setLayout(new BorderLayout());
    
    
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    
    /** akolouthoun oi aparaitites rithmiseis gia to xrwma */
    panel1.setBackground(Color.WHITE);
    panel2.setBackground(Color.WHITE);
    panel3.setBackground(Color.WHITE);
    
    
    
    contentPane.add(panel2,BorderLayout.NORTH);
    contentPane.add(panel3,BorderLayout.SOUTH);
    contentPane.add(panel1,BorderLayout.CENTER);
    
    /** dimiourgeitai ena koumpi "Go" k ena koumpi "Restart", akomh, kataxwreitai i parametros "this" ws 
     * akroaths, pou tha lamvanei gegonota afenos apo to
     * koumpi pou legetai playbutton kai afeterou apo to koumpi pou legetai startbutton 
     */
    
    JButton playbutton = new JButton("Go");
    JButton startbutton = new JButton("Restart");
    playbutton.addActionListener(this);
    panel3.add(playbutton);
    startbutton.addActionListener(this);
    panel3.add(startbutton);
    
    
    
    
}


  
/** ylopoihsh tis parakatw methodou, symfwna me tin opoia, h entolh diakladwsis (if) eksartatai apo
 * tin klhsh e.getActionCommand()...Stin prokeimeni, elegxetai arxika to "Restart", wste an xreiastei 
 * na "epanekkinisw tin diadikasia"..Akolouthws, elegxetai to "Go", kai pali me xrhsh (if), mesa 
 * stin opoia lamvanei xwra i aparaititi epanaliptiki diadikasia(for), gia ton sxediasmo tou sximatos
 * mou
 */
  
  public void actionPerformed(ActionEvent e)
  {
	  //Container contentPane = getContentPane();
	

	  if(e.getActionCommand().equals("Restart"))
	  {
		  panel1.repaint();
	  }

	  
	  
	  if(e.getActionCommand().equals("Go"))
	  {
		  
          A[0]=200;	//200
          A[1]=50;	//50
		  B[0]=50;	//50
		  B[1]=100;	//100
		  C[0]=300;	//300
		  C[1]=100;	//100
		  
		  trexon[0]=A[0];
		  trexon[1]=A[1];
		  
		    Graphics g=getGraphics();
		    g.setColor(Color.BLACK);
		    
		    
		  /** mesa stin for, kaleitai h methodos drawline, dinontas ths ta katallhla simeia -symfwna panta me tin
		   * ekfwnhsh tou algorithmou tou projekt- enw me tin xrhsh tis Math.random() ylopoieitai i sxediasi 
		   * (o arithmos twn epanalipsewn, uiothetithike me vasi xaraktiristiki anafora tis ekfwnisis
		   */
		  for(i=0;i<50000;i++)
		  {
			    
			    g.drawLine((int)trexon[0],(int)trexon[1],(int)trexon[0],(int)trexon[1]);  
			    
			    x=Math.random();
			    
			    y=(int)(3*x);
			    
			    
			    if(y==0)
			    {
			    	trexon[0]=(trexon[0]+A[0])/2.0;
			    	trexon[1]=(trexon[1]+A[1])/2.0;
			    }
			    
			    else if(y==1)
			    {
			    	trexon[0]=(trexon[0]+B[0])/2.0;
			    	trexon[1]=(trexon[1]+B[1])/2.0;
			    }
			    
			    else if(y==2)
			    {
			    	trexon[0]=(trexon[0]+C[0])/2.0;
			    	trexon[1]=(trexon[1]+C[1])/2.0;
			    }
			    
			    
		  }
	   
	  }  
		   
	  }//methodos
  
  }//klasi
  
 
  
	  
	  
  
  