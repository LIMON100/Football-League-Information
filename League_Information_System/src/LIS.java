import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.border.CompoundBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class LIS {

	private JFrame frame;
	private JPanel Laliga1,BPL1,Main,p1,p2,p3,p4;
	private JTable table,table2;
	private JTabbedPane tb;
	 private JList list,list_1;
	 
	 String[]ds={"Full Name         :Diego Simeone","Country           :Argentina","Playing position  :Defensive Midfielder","Current Club      :Atletico Madrid","previous Club     :Racing club"};
	 String[]ev={"Full Name         :Ernesto Valverde","Country           :Spain","Playing position  :Forward","Current Club      :Barcelona","previous Club     :Athletic Bilbao"};
	 String[]jc={"Full Name         :Javier Calleja","Country           :Spain","Playing position  :Midfielder","Current Club      :Villarreal","previous Club     :Villarreal B"};
	 String[]jm={"Full Name         :Jose Mourinho","Country           :Portugal","Playing position  :Midfielder","Current Club      :Manchester United","previous Club     :Chelsea"};
	 String[]jg={"Full Name         :Josep Guardiola","Country           :Spain","Playing position  :Midfielder","Current Club      :Manchester City","previous Club     :Bayern Munich"};
	 String[]jk={"Full Name         :Jurgen Klopp","Country           :Germany","Playing position  :Striker","Current Club      :Liverpool","previous Club     :Borussia Dortmund"};
	 String[]mg={"Full Name         :Marcelino García","Country           :Spain","Playing position  :Midfielder","Current Club      :Valencia","previous Club     :Villarreal"};
	 String[]mc={"Full Name         :Mauricio Pochettino","Country           :Argentina","Playing position  :Centre back","Current Club      :Tottenham Hotspur","previous Club     :Southampton"};
	 String[]zz={"Full Name           :Zinedine Zidane","Country           :France","Playing position  :Attacking Midfielder","Current Club      :Real Madrid","previous Club     :Real Madrid Castilla"};
	 String[]ac={"Full Name         :Antonio Conte","Country           :Italy","Playing position  :Midfielder","Current Club      :Chelsea","previous Club     :Italy"};
 
	
	 String[]va1={"Full Name:Francis Coquelin","Country:France","Current Club:Valencia","Playing Position:Defensive Midfielder"};
	 String[]va2={"Full Name:Ezequiel Marcelo Garay González","Country:Argentina","Current Club:valencia","Playing Position:Centre back"};
	 String[]va3={"Full Name:Geoffrey Kondogbia","Country:France","Current Club:valencia","Playing Position:Defensive midfielder"};
	 String[]va4={"Full Name:Gonçalo Manuel Ganchinho Guedes","Country:Portugal","Current Club:Valencia","Playing Position:Winger"};
	 String[]va5={"Full Name:José Luis Gayà Peña","Country:Spain","Current Club:Valencia","Playing Position:Left Back"};
	 String[]va6={"Full Name:Martín Montoya Torralbo","Country:Spain","Current Club:valencia","Playing Position:Right back"};
	 String[]va7={"Full Name:Norberto Murara Neto","Country:Brazil","Current club:Valencia","Playing Position:Goalkeeper"};
	 String[]va8={"Full Name        :Daniel Parejo Muñoz","Country          :Spain","Current Club     :Valencia","Playing Position :Midfielder"};
	 String[]va9={"Full Name:Rodrigo Moreno Machado","Country:Brazil","Current Club:valencia","Playing Position:Striker"};
	 String[]va10={"Full Name:Santiago Mina Lorenzo","Country:Spain","Current Club:Valencia","Playing Position:Forward"};
	 String[]va11={"Full Name:Tony Lato","Country:Spain","Current Club:Valencia","Playing Position:Left Back"};
	 
	 String[]at1={"Full Name         :Antoine Griezmann","Country           :France","Current Club      :Atletico Madrid","Playing Position  :Forward"};
	 String[]at2={"Full Name         :Antonio Montoro Rodríguez","Country           :Spain","Current Club      :Atletico Madrid","Playing Position  :Centre back"};
	 String[]at3={"Full Name         :Diego da Silva Costa","Country           :Brazil","Current Club      :Atletico Madrid","Playing Position  :Striker"};
	 String[]at4={"Full Name         :Fernando José Torres Sanz","Country           :France","Current Club      :Atletico Madrid","Playing Position  :Striker"};
	 String[]at5={"Full Name         :Filipe Luís Kasmirski","Country           :Brazil","Current Club      :Atletico Madrid","Playing Position  :Left back"};
	 String[]at6={"Full Name         :Gabriel Fernández Arenas","Country           :Spain","Current Club      :Atletico Madrid","Playing Position  :Midfielder"};
	 String[]at7={"Full Name         :Jan Oblak","Country           :Slovenia","Current Club      :Atletico Madrid","Playing Position  :Goalkeeper"};
	 String[]at8={"Full Name         :Juan Francisco Torres Belén","Country           :Spain","Current Club      :Atletico Madrid","Playing Position  :Right back"};
	 String[]at9={"Full Name         :Jorge Resurreccion Merodio","Country           :Spain","Current Club      :Atletico Madrid","Playing Position  :Midfielder"};
	 String[]at10={"Full Name         :Lucas François Bernard","Country           :France","Current Club      :Atletico Madrid","Playing Position  :Defender"};
	 String[]at11={"Full Name         :Antonio Moya Vega","Country           :Spain","Current Club      :Atletico Madrid","Playing Position  :Midfielder"};
	 
	 String[]r1={"Full Name         :Carlos Henrique Casemiro","Country           :Brazil","Current Club      :Real Madrid","Playing Position  :Midfielder"};
	 String[]r2={"Full Name         :Francisco Román Alarcón Suárez","Country           :Spain","Current Club      :Real Madrid","Playing Position  :Midfielder"};
	 String[]r3={"Full Name         :Karim Mostafa Benzema","Country           :France","Current Club      :Real Madrid","Playing Position  :Striker"};
	 String[]r4={"Full Name         :Luka Modric","Country           :Croatia","Current Club      :Real Madrid","Playing Position  :Midfielder"};
	 String[]r5={"Full Name         :Cristiano Ronaldo dos Santos Aveiro","Country           :Portugal","Current Club      :Real Madrid","Playing Position  :Forward"};
	 String[]r6={"Full Name         :Daniel Carvajal Ramos","Country           :Spain","Current Club      :Real Madrid","Playing Position  :Right back"};
	 String[]r7={"Full Name         :Gareth Frank Bale","Country           :Wales","Current Club      :Real Madrid","Playing Position  :Winger"};
	 String[]r8={"Full Name         :José Ignacio Fernández Iglesias","Country           :Spain","Current Club      :Real Madrid","Playing Position  :Midfielder"};
	 String[]r9={"Full Name         :Keylor Antonio Navas Gamboa","Country           :Costa Rica","Current Club      :Real Madrid","Playing Position  :Goalkeeper"};
	 String[]r10={"Full Name         :Marcelo Vieira da Silva Júnior","Country           :Brazil","Current Club      :Real Madrid","Playing Position  :Left back"};
	 String[]r11={"Full Name         :Sergio Ramos García","Country           :Spain","Current Club      :Real Madrid","Playing Position  :Defender"};
	 
	 private String[]b1={"Full Name         :Jordi Alba Ramos","Country     :Spian","Current Club :Barcelona","Possition    :Left brack"};
	 private String[]n2={"Full Name         :Sergio Busquets Burgos","Country     :Spian","Current Club :Barcelona","Possition    :Defensive midfielder"};
	 private String[]n6={"Full Name         :Marc ter Stegan","Country     :Germany","Current Club :Barcelona","Possition    :Goalkeeper"};
	 private String[]n11={"Full Name         :Aleix Vidal Parreu","Country     :Spain","Current Club :Barcelona","Possition    :Right-back"};
	 private String[]n9={"Full Name         :Luis Alberto Suárez Díaz","Country     :Uruguay","Current Club :Barcelona","Possition    :Striker"};
	 private String[]n4={"Full Name          :Joseph Dave Gomez","Country     :England","Current Club :Barcelona","Possition    :Defender"};
	 private String[]n5={"Full Name          :Andrés Iniesta Luján","Country     :Spian","Current Club :Barcelona","Possition    :Midfielder"};
	 private String[]n3={"Full Name         :Philippe Coutinho Correia","Country     :Brazil","Current Club :Barcelona","Possition    :Attacking midfielder"};
	 private String[]n8={"Full Name         :Gerard Piqué Bernabéu","Country     :Spian","Current Club :Barcelona","Possition    :Center barck"};
	 private String[]n10={"Full Name         :Samuel Yves Umtiti","Country    :Cameroon","Current Club :Barcelona","Possition    :Center back"};
	 private String[]n7={"Full Name         :Lionel Andrés Messi","Country     :Argentina","Current Club :Barcelona","Possition    :Forward"};
     private String[] names= {"Full Name        :Daniel Parejo Muñoz","Country          :Spain", "Current Club     :Valencia","Playing Position :Midfielder"};
     private String[] v1={"Full Name:Francis Coquelin","Country:France","Current Club:Valencia","Playing Position:Defensive Midfielder"};
     private String[] n1={"Full Name    : Alexis Alejandro Sánchez Sánchez","Country      : Chille","Current Club : Manchester United","Position     : Forward/Winger"};
     private String[]name1={"Name         :Francesc Fàbregas Soler","Country     :Spian","Current Club :Chelsea","Possition    :Midfielder"};
     private String[]name2={"Name         :David Luiz Moreira Marinho","Country     :Brazil","Current Club :Chelsea","Possition    :Center brack"};
     private String[] name3={"Name         :Eden Michael Hazard","Country     :Belgium","Current Club :Chelsea","Possition    :Froward"};
     private String[]name5={"Name              :Álvaro Borja Morata ","Country          :Spian","Current Club      :Chelsea","Playing Possition :Strker"};
     private String[]name4={"Name              :Marcos Alonso Mendoza","Country          :Spian","Current Club      :Chelsea","Playing Possition :left-back"};
     private String[]name6={"Name              :N'Golo Kanté","Country          :France","Current Club      :Chelsea","Playing Possition :Defensive midfielder"};
     private String[]name7={"Name              :Thibaut Nicolas Marc Courtois","Country          :Belgium","Current Club      :Chelsea","Playing Possition :Goalkeeper"};
     private String[]name8={"Name              :Tiémoué Bakayoko","Country          :France","Current Club      :Chelsea","Playing Possition :Defesive midfielder"};
     private String[]name9={"Name              :Willian Borges da Silva","Country          :Brazil","Current Club      :Chelsea","Playing Possition :Attacking midfielder"};
     private String []name11={"Full Name         :Gary James Cahill","Country          :Belgium","Current Club      :Chelsea","Playing Possition :Centre back"};
     private String []name10={"Full Name         :Olivier Giroud","Country          :France","Current Club      :Chelsea","Playing Possition :Striker"};
     
     String[]t1={"Full Name       :Daniel Lee Rose","Country         :England","Current Club    :Tottenhum","Playing Position:Left back"},t3={"Full Name       :Eric Jeremy Edgar Dier","Country         :England","Current Club    :Tottenham","Playing Position:Defender"},t7={"Full Name       :Fernando Javier Llorente Torres","Country         :Spain","Current Club    :Tottenham","Playing Position:Striker"};
     String[]t4={"Full Name       :Harry Edward Kane","Country         :England","Current Club    :Tottenham","Playing Position:striker"};
     String[]t2={"Full Name       :Hugo Lloris","Country         :France","Current Club    :Tottenham","Playing Position:Goalkeeper"};
     String[]t5={"Full Name       :Juan Marcos Foyth","Country         :Argentina","Current Club    :Tottenham","Playing Position:Center back"};
     String[]t6={"Full Name       :Kazaiah Roy Barrett Sterling","Country         :England","Current Club    :Tottenham","Playing Position:Forward"};
     String[]t8={"Full Name       :Lucas Rodrigues Moura da Silva","Country         :Brazil","Current Club    :Tottenham","Playing Position:Forward"};
     String[]t9={"Full Name       :Serge Alain Stephane Aurier","Country         :Ivory coast","Current Club    :Tottenham","Playing Position:Right back"};
     String[]t10={"Full Name      :Tobias Albertine Maurits Alderweireld","Country         :Belgium","Current Club    :Tottenham","Playing Position:Defender"};
     String[]t11={"Full Name      :Victor Mugubi Wanyama","Country         :Kenya","Current Club    :Tottenham","Playing Position:Midfielder"};
     
     String[]mu1={"Full Name    : Alexis Alejandro Sánchez Sánchez","Country      : Chille","Current Club : Manchester United","Position     : Forward/Winger"};
     String[]mu2={"Full Name    : Ashley Simon Young","Country      : England","Current Club : Manchester United","Position     : Winger/Wing back/Full back"};
     String[]mu3={"Full Name    : David de Gea Quintana","Country      : Spain","Current Club : Manchester United","Position     : Goalkeeper"};
     String[]mu4={"Full Name    : Eric Bertrand Bailly","Country      : Ivory Coast","Current Club : Manchester United","Position     : Centre-back"};
     String[]mu5={"Full Name    : Juan Manuel Mata García","Country      : Spain","Current Club : Manchester United","Position     : Attacking Midfielder"};
     String[]mu6={"Full Name    : Romelu Menama Lukaku Bolingoli","Country      : Belgium","Current Club : Manchester United","Position     : Forward"};
     String[]mu7={"Full Name    : Luke Paul Hoare Shaw","Country      : England","Current Club : Manchester United","Position     : Left Back"};
     String[]mu8={"Full Name    : Marouane Fellaini-Bakkiouoi","Country      : Belgium","Current Club : Manchester United","Position     : Midfielder"};
     String[]mu9={"Full Name    : Michael Carrick","Country      : England","Current Club : Manchester United","Position     : Midfielder"};
     String[]mu10={"Full Name    : Philip Anthony Jones","Country      : England","Current Club : Manchester United","Position     : Defender"};
     String[]mu11={"Full Name    : Paul Labile Pogba","Country      : France","Current Club : Manchester United","Position     : Midfielder"};
	
     String[]vi1={"Full Name:Álvaro González Soberón","Country:Spain","Current Club:villarrea","Playing Position:centre back"};
     String[]vi2={"Full Name:Andrés Eduardo Fernández Moreno","Country:Spain","Current Club:villarrea","Playing Position:Goal keeper"};
     String[]vi3={"Full Name             :Carlos Arturo Bacca Ahumada","Country          :Colombia","Current club     :Villarreal","Playing position :Striker"};
     String[]vi4={"Full Name:Jaume Vicent Costa Jordá","Country:Spain","Current Club:villarreal","Playing Position:Left back"};
     String[]vi5={"Full Name:Manuel Trigueros Muñoz","Country:Spain","Current Club:villarreal","Playing Position:Midfielder"};
     String[]vi6={"Full Name:Mario Gaspar Pérez Martínez","Country:Spain","Current Club:villarreal","Playing Position:Right back"};
     String[]vi7={"Full Name:Pablo Fornals Malla","Country:Spain","Current Club:villarrea","Playing Position:Mid fielder"};
     String[]vi8={"Full Name:Roberto Soriano","Country:Germany","Current Club:villarreal","Playing Position:Midfielder"};
     String[]vi9={"Full Name:Rodrigo Hernández Cascante","Country:Spain","Current Club:villarreal","Playing Position:Midfielder"};
     String[]vi10={"Full Name:Samuel Castillejo Azuaga","Country:Spain","Current Club:villarreal","Playing Position:Winger"};
     String[]vi11={"Full Name:Víctor Moya Martínez","Country:Spain","Current Club:villarreal","Playing Position:Mid fielder"};
     
     String[]c1={"Full Name    :Sergio Leonel Agüero","Country      :Argentina","Current Club :Manchester City","position     :Striker"};
     String[]c2={"Full Name    :Nicolás Hernán Gonzalo Otamendi","Country      :Argentina","Current Club :Manchester City","position     :Centre back"};
     String[]c3={"Full Name    :David Josué Jiménez Silva","Country      :Spain","Current Club :Manchester City","position     :Midfielder"};
     String[]c4={"Full Name    :Raheem Shaquille Sterling","Country      :Jamaica","Current Club :Manchester City","position     :Winger"};
     String[]c5={"Full Name    :Gnégnéri Yaya Touré","Country      :Ivory Coasr","Current Club :Manchester City","position     :Midfielder"};
     String[]c6={"Full Name    :Kyle Andrew Walker","Country      :England","Current Club :Manchester City","position     :Right Back"};
     String[]c7={"Full Name    :Claudio Andrés Bravo Muñoz","Country      :Chille","Current Club :Manchester City","position     :Goalkeeper"};
     String[]c8={"Full Name    :Danilo Luiz da Silva","Country      :Brazil","Current Club :Manchester City","position     :Full back"};
     String[]c9={"Full Name    :Fernando Luiz Roza","Country      :Brazi","Current Club :Manchester City","position     :Defensive Midfielder"};
     String[]c10={"Full Name    :Gabriel Fernando de Jesus","Country      :Brazi","Current Club :Manchester City","position     :Forward"};
     String[]c11={"Full Name    :Vincent Jean Mpoy Kompany","Country      :Belgium","Current Club :Manchester City","position     :Centre Back"};
     
     String[]l1={"Full Name    :Alberto Moreno Pérez","Current Club :Liverpool","Position     :Left back"};
     String[]l2={"Full Name    :Andrew Robertson","Country      :Scotland","Current Club :Liverpool","Position     :Left-back"};
     String[]l3={"Full Name    :Daniel William John Ings","Country      :England","Current Club :Liverpool","Position     :Forward"};
     String[]l4={"Full Name    :Georginio Gregion Emile Wijnaldum","Country      :Netherlands","Current Club :Liverpool","Position     :Attacking Midfielder"};
     String[]l5={"Full Name    :James Philip Milner","Country      :England","Current Club :Liverpool","Position     :Winger/Midfielder/Full-back"};
     String[]l6={"Full Name    :Joseph Dave Gomez","Country      :England","Current Club :Liverpool","Position     :Defender"};
     String[]l7={"Full Name        :Jordan Brian Henderson","Country          :England","Current Club     :Liverpool","Playing Position :Midfielder"};
     String[]l8={"Full Name        :Loris Sven Karius","Country          :Germeny","Current Club     :Liverpool","Playing Position :Goalkeeper"};
     String[]l9={"Full Name        :Mohamed Salah Ghaly","Country          :Egypt","Current Club     :Liverpool","Playing Position :Forward"};
     String[]l10={"Full Name        :Ragner Klaven","Country          :Estonia","Current Club     :Liverpool","Playing Position :Centre back"};
     String[]l11={"Full Name        :Roberto Firmino Barbosa de Oliveira","Country          :Brazil","Current Club     :Liverpool","Playing Position :Forward"};
     
	 String[] col= {"   Team","   MP","     W","     D","     L","     Pts"};
	
	 String[][] row = {
			
			{"1   Barcelona", "     30", "     23", "     7", "     0", "     76"},
			{"2.  Atletico madrid","     30","     20","     7","     3","     67"},
			{"3.  Real madrid","     30","     29","     6","     5","     63"},
			{"4.  Valencia","     30","     19","     5","     6","     62"},
			{"5.  Villarreal","     30","     14","     5","     11","     47"},
			{"6.  Sevilla","     30","     14","     4","     12","     46"},
			{"7.  Girona","     30","     12","     8","     10","     44"},
			{"8.  Real Betis","     30","     14","     4","     12","     46"},
			{"9.  Getafe","     30","     10","     9","     11","     39"},
			{"10. Celta vigo","     30","     11","     7","     12","     40"},

          };
	 
	 String[] col1= {"Name","  Goals","  Assists"};
	 String[][] row1= {
			 {" Lionel Messi","     25","     12"},
			 {" Cristiano Ronaldo","     22","     5"},
			 {" Antoine Griezmann","     21","     6"},
			 {" Cristhian Stuani","     17","     8"},
			 {" Iago Aspas","     17","     0"},
			 {" Rodrigo","     16","     5"},
			 {" Willian José","     13","     4"},
			 {" Maxi Gómez","     13","     2"},
			 {" Ángel Rodríguez","     12","     2"},
			 {" Simone Zaza","     12","     1"},
	 };
			
	 String[] col2= {"   Team","   MP","     W","     D","     L","     Pts"};	
	 String[][] row2 = {
			
			{"1   Manchester City", "     31", "     27", "     3", "     1", "     84"},
			{"2.  Manchester United","     31","     21","     5","     5","     68"},
			{"3.  Liverpool","     32","     19","     9","     4","     66"},
			{"4.  Tottenham Hotspur","     31","     19","     7","     5","     64"},
			{"5.  Chelsea","     31","     17","     5","     9","     56"},
			{"6.  Arsenal","     30","     15","     6","     10","     51"},
			{"7.  Burnley","     31","     12","     10","     9","     46"},
			{"8.  Leicester City","     31","     11","     10","     10","     43"},
			{"9.  Everton","     32","     11","     7","     14","     40"},
			{"10. Bournemouth","     32","     9","     10","     13","     37"},
	 };


    String[] col3= {"Name","  Goals","  Assists"};
    String[][]row3= {

             {" Mohamed Salah","     28","     9"},
             {" Harry Kane","     24","     2"},
             {" Sergio Aguero","     21","     6"},
             {" Raheem Sterling","     15","     7"},
             {" Roberto Firmino","     14","     7"},
             {" Romelu Lukaku","     14","     7"},
             {" Jamie vardy","     14","     1"},
             {" Son Heung-min","     12","     4"},
             {" Eden Hazard","     11","     3"},
             {" Glenn Murray","     11","     0"},
    };
	private JTable table_1;
	private JScrollPane scrollPane;
	private Font f,f1;
	private JLabel Score;
	private JTable table_2;
	private JScrollPane scrollPane_1;
	private JTable table_3;
	private JScrollPane scrollPane_3;
	private JTable table_4;
	private JScrollPane scrollPane_4;
	private JPanel Barcelona,Valencia,AtleticoMadrid,Villarreal,Sevilla,Girona,CeltaVigo,RealBetis,Getafe,RealMadrid;
	private JPanel ManchesterCity,ManchesterUtd,Chelsea,Tottenham,Liverpool,Burnley,Arsenal,LeicesterCity,Everton,Bournemouth;
	private JPanel Parejo,cooquelin,mina,garay,gayaa,neto,guedess,kondogbia,latoo,rodrogoo,montoyaa;
	private JPanel alvero,andres,jaume,manuel,mario,pablo,soriano,rodri,samuel,victor,carlosbacca;
	private JPanel Cescfabregas,Davidluiz,Edenhazard,giroud,Marcosalonso,morata,kante,Thibautcourtois,tiemoue,willian,cahil;
	private JPanel hugo,daniel,eric,juan,kazaia,liorente,lucas,serge,tobias,victor1,harry;
	private JPanel aguero,claudiobravo,danilo,fernandinho,jesus,kompany,otamendi,silva,sterling,toure,walker;
	private JPanel cristianoronaldo,marcelo,navas,ramos,carvajal,isco,modrich,casemiro,bale,benzama,nacho;
	private JPanel Albertomoreno,Andrewrobertson,Dannyings,Georginio,Jamesmilner,Joegomez,Jordanhenderson,karius,Salah,Ragnarklaven,Robertofirmino;
	private JPanel AntoineGriezmann,AntonioRodriguez,AntonioMoya,DiegoCosta,FernandoTorres,FilipeLuis,GabrielFernandez,Janoblak,Juanfrancisco,Lucasbernard,koke;
    private JPanel AntonioConte,Diegosimeone,ErnestoValverde,Javiercalleja,JoseMourinho,Jurgenklopp,MarcelinoGarcía,MauricioPochettino,ZinedineZidane,JosepGuardiola;
    private JPanel sanchez,young,degea,lukaku,fellani,philjones,pogba,carrick,baily,lukeshaw,mata,panel_2,C;
	private JButton btnNewButton,bw1,bw2;
	private JTextField tb1;
	 
	 public void drwan(Graphics g)
	  {
	      g.setColor(Color.red);
	      g.fillOval(100,100,70,70);
	       
	  }

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LIS window = new LIS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LIS() {
		initialize();
	}

	private void initialize() {
		f=new Font("Tahoma",Font.BOLD,18);
	    f1=new Font("Century Gothic",Font.BOLD,12);
		frame = new JFrame();
		frame.setBackground(new Color(128, 0, 0));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(LIS.class.getResource("/IMAGE/7764660-pi\u00E5\u201Aka-no\u00E5\u00BCna-ball-na-ogie\u00E5\u201E-i-woda-grafika-2d-projekt-komputera-.jpg")));
		frame.setBounds(100, 100, 1204, 788);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Football League Information");
		frame.setFont(f);
	    frame.getContentPane().setLayout(new CardLayout(0, 0));
	    
	    Main = new JPanel();
	    Main.setBounds(0, 0, 434, 261);
	    frame.getContentPane().add(Main);
	    Main.setLayout(null);
	    
	    JButton Laliga = new JButton("Spanish - La-Liga");
	    Laliga.setBackground(new Color(70, 180, 180));
	    Laliga.setFont(new Font("Tahoma", Font.BOLD, 13));
	    Laliga.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		Laliga1.setVisible(true);
	    	    Main.setVisible(false);
	    		
	    	}
	    });
	    Laliga.setBounds(581, 84, 192, 59);
	    Main.add(Laliga);
	    
	    JButton BPL = new JButton("English - Barclays Premier League");
	    BPL.setBackground(new Color(60, 230, 113));
	    BPL.setFont(new Font("Tahoma", Font.BOLD, 13));
	    BPL.setBounds(556, 221, 273, 77);
	    BPL.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		BPL1.setVisible(true);
	    		Main.setVisible(false);
	    	}
	    	
	    });
	    Main.add(BPL);
	    
	    JLabel lblNewLabel_167 = new JLabel();
	    lblNewLabel_167.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/resize.png")));
	    lblNewLabel_167.setBounds(0, 0, 1350, 950);
	    Main.add(lblNewLabel_167);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBounds(10, 280, 70, 59);
	    Main.add(panel_1);
	    panel_1.setLayout(null);
	    
	    panel_2 = new JPanel();
	    panel_2.setLayout(null);
	    panel_2.setBackground(Color.black);
	    panel_2.setVisible(false);
	    panel_2.setBounds(10, 339, 253, 399);
	    Main.add(panel_2);
	    
	    JButton btnNewButton_19 = new JButton();
	    btnNewButton_19.setBackground(Color.WHITE);
	    btnNewButton_19.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Travel-Museum-icon (1).png")));
	    btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			     panel_2.setVisible(true);
			     panel_1.setVisible(false);
			}
	    });
	    btnNewButton_19.setBounds(0, 0, 48, 48);
	    panel_1.add(btnNewButton_19);
		
	    JPanel MarcStegen = new JPanel();
	    MarcStegen.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(MarcStegen, "name_845694593643253");
	    MarcStegen.setLayout(null);
	    
	    JButton btnNewButton_151 = new JButton();
	    btnNewButton_151.setBackground(Color.BLACK);
	    btnNewButton_151.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_151.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		MarcStegen.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_151.setBounds(0, 0, 30,30);
	    MarcStegen.add(btnNewButton_151);
	    
	    JList list_22 = new JList(n6);
	    list_22.setForeground(Color.WHITE);
	    list_22.setFont(new Font("Tahoma", Font.BOLD, 14));
	    list_22.setBackground(new Color(47, 79, 79));
	    list_22.setBounds(59, 51, 240, 80);
	    MarcStegen.add(list_22);
	    
	    JLabel lblNewLabel_87 = new JLabel();
	    ///lblNewLabel_87.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/marc.png")));
	    lblNewLabel_87.setBounds(420, 51, 285, 92);
	    MarcStegen.add(lblNewLabel_87);
	    
	    JPanel LionelMessi = new JPanel();
	    LionelMessi.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(LionelMessi, "name_845758290480709");
	    LionelMessi.setLayout(null);
	    
	    JButton btnNewButton_184 = new JButton();
	    btnNewButton_184.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_184.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		LionelMessi.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_184.setBounds(0, 0, 30,30);
	    LionelMessi.add(btnNewButton_184);
	    
	    JList list_12 = new JList(n7);
	    list_12.setBounds(80, 53,  400,115);
	    LionelMessi.add(list_12);
	    
	    JLabel lblNewLabel_88 = new JLabel();
	    ///lblNewLabel_88.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/messi.jpg")));
	    lblNewLabel_88.setBounds(564, 47, 120,100);
	    LionelMessi.add(lblNewLabel_88);
	    
	    JPanel JordiAlba = new JPanel();
	    JordiAlba.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(JordiAlba, "name_845762519965047");
	    JordiAlba.setLayout(null);
	    
	    JButton btnNewButton_185 = new JButton();
	    btnNewButton_185.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_185.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		JordiAlba.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_185.setBounds(0, 0, 30,30);
	    JordiAlba.add(btnNewButton_185);
	    
	    JList list_13 = new JList(b1);
	    list_13.setBounds(80, 61,  400,115);
	    JordiAlba.add(list_13);
	    
	    JLabel lblNewLabel_89 = new JLabel();
	    ///lblNewLabel_89.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/alba.jpg")));
	    lblNewLabel_89.setBounds(574, 61, 109, 88);
	    JordiAlba.add(lblNewLabel_89);
	    
	    JPanel GeradPique = new JPanel();
	    GeradPique.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(GeradPique, "name_845764537545024");
	    GeradPique.setLayout(null);
	    
	    JButton btnNewButton_186 = new JButton();
	    btnNewButton_186.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_186.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		GeradPique.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_186.setBounds(0, 0, 30,30);
	    GeradPique.add(btnNewButton_186);
	    
	    JList list_14 = new JList(n8);
	    list_14.setBounds(50,50, 400,115);
	    GeradPique.add(list_14);
	    
	    JLabel lblNewLabel_90 = new JLabel();
	    ///lblNewLabel_90.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/pique.jpg")));
	    lblNewLabel_90.setBounds(566, 50, 100, 80);
	    GeradPique.add(lblNewLabel_90);
	    
	    JPanel SamuelUmiti = new JPanel();
	    SamuelUmiti.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(SamuelUmiti, "name_845766920842531");
	    SamuelUmiti.setLayout(null);
	    
	    JButton btnNewButton_187 = new JButton();
	    btnNewButton_187.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_187.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		SamuelUmiti.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_187.setBounds(0, 0, 30,30);
	    SamuelUmiti.add(btnNewButton_187);
	    
	    JList list_15 = new JList(n10);
	    list_15.setBounds(50,50, 400,115);
	    SamuelUmiti.add(list_15);
	    
	    JLabel lblNewLabel_91 = new JLabel();
	  /// lblNewLabel_91.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/umiti.jpg")));
	    lblNewLabel_91.setBounds(583, 60, 120,100);
	    SamuelUmiti.add(lblNewLabel_91);
	    
	    JPanel LuizSuarez = new JPanel();
	    frame.getContentPane().add(LuizSuarez, "name_845777595614029");
	    LuizSuarez.setLayout(null);
	    
	    JButton btnNewButton_188 = new JButton();
	    btnNewButton_188.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_188.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		LuizSuarez.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_188.setBounds(0, 0, 30,30);
	    LuizSuarez.add(btnNewButton_188);
	    
	    JList list_16 = new JList(n9);
	    list_16.setBounds(50,50, 400,115);
	    LuizSuarez.add(list_16);
	    
	    JPanel coutinh = new JPanel();
	    coutinh.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(coutinh, "name_845780705881951");
	    coutinh.setLayout(null);
	    
	    JButton button = new JButton();
	    button.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		coutinh.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    button.setBounds(0, 0,30,30);
	    coutinh.add(button);
	    
	    JList list_17 = new JList(n3);
	    list_17.setBounds(50,50, 400,115);
	    coutinh.add(list_17);
	    
	    JLabel lblNewLabel_92 = new JLabel();
	   /// lblNewLabel_92.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/coutinho.jpg")));
	    lblNewLabel_92.setBounds(567, 50, 100, 80);
	    coutinh.add(lblNewLabel_92);
	    
	    JPanel AndreIniesta = new JPanel();
	    frame.getContentPane().add(AndreIniesta, "name_845782897588731");
	    AndreIniesta.setLayout(null);
	    
	    JButton btnNewButton_189 = new JButton();
	    btnNewButton_189.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_189.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		AndreIniesta.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_189.setBounds(10, 0, 89, 23);
	    AndreIniesta.add(btnNewButton_189);
	    
	    JList list_18 = new JList(n5);
	    list_18.setBounds(88,60, 400,115);
	    AndreIniesta.add(list_18);
	    
	    JLabel lblNewLabel_93 = new JLabel();
	   /// lblNewLabel_93.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/iniesta.jpg")));
	    lblNewLabel_93.setBounds(570, 50,100,90);
	    AndreIniesta.add(lblNewLabel_93);
	    
	    JPanel AndreGomez = new JPanel();
	    AndreGomez.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(AndreGomez, "name_845784961421587");
	    AndreGomez.setLayout(null);
	    
	    JButton btnNewButton_190 = new JButton();
	    btnNewButton_190.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_190.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		AndreGomez.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_190.setBounds(0, 0, 30,30);
	    AndreGomez.add(btnNewButton_190);
	    
	    JList list_19 = new JList(n4);
	    list_19.setBounds(50,50,403,114);
	    AndreGomez.add(list_19);
	    
	    JLabel lblNewLabel_94 = new JLabel();
	   /// lblNewLabel_94.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/gomez.jpg")));
	    lblNewLabel_94.setBounds(575, 57,100,90);
	    AndreGomez.add(lblNewLabel_94);
	    
	    JPanel SerBusqets = new JPanel();
	    frame.getContentPane().add(SerBusqets, "name_846413426452781");
	    SerBusqets.setLayout(null);
	    
	    JButton btnNewButton_191 = new JButton();
	    btnNewButton_191.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_191.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		SerBusqets.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_191.setBounds(0, 0, 30,30);
	    SerBusqets.add(btnNewButton_191);
	    
	    JList list_20 = new JList(n2);
	    list_20.setBounds(71, 65, 400,115);
	    SerBusqets.add(list_20);
	    
	    JLabel lblNewLabel_95 = new JLabel();
	   /// lblNewLabel_95.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/busquets.jpg")));
	    lblNewLabel_95.setBounds(579, 55,100,90);
	    SerBusqets.add(lblNewLabel_95);
	    
	    JPanel AlexVidal = new JPanel();
	    AlexVidal.setBackground(new Color(47, 79, 79));
	    frame.getContentPane().add(AlexVidal, "name_846488294866849");
	    AlexVidal.setLayout(null);
	    
	    JButton btnNewButton_192 = new JButton();
	    btnNewButton_192.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
	    btnNewButton_192.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		AlexVidal.setVisible(false);
	    		Barcelona.setVisible(true);
	    	}
	    });
	    btnNewButton_192.setBounds(0, 0,30,30);
	    AlexVidal.add(btnNewButton_192);
	    
	    JList list_21 = new JList(n11);
	    list_21.setFont(new Font("Tahoma", Font.BOLD, 14));
	    list_21.setBackground(Color.GRAY);
	    list_21.setBounds(54, 57,  400,115);
	    AlexVidal.add(list_21);
		
	    JLabel lblNewLabel_96 = new JLabel();
	    ////lblNewLabel_96.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/vidal.jpg")));
	    lblNewLabel_96.setBounds(578, 60,100,90);
	    AlexVidal.add(lblNewLabel_96);
	    
	    Laliga1 = new JPanel();
		Laliga1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(Laliga1);
		Laliga1.setLayout(null);
		
		JButton back1 = new JButton();
		back1.setBackground(Color.WHITE);
		back1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.setVisible(true);
				Laliga1.setVisible(false);
			}
		});
		back1.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		back1.setBounds(10, 11, 16, 16);
		Laliga1.add(back1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(87, 53, 853, 186);
		Laliga1.add(scrollPane);
		
		table_1 = new JTable(row,col);
		table_1.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(table_1);
		table_1.setFillsViewportHeight(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 0, 0), new Color(255, 200, 0)));
		table_1.setToolTipText("");
		table_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table_1.setFont(new Font("Arial Unicode MS", Font.BOLD, 14));
		
		ListSelectionModel model=table_1.getSelectionModel();
		model.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if(! model.isSelectionEmpty())
				{
   				    int selectedRow=model.getMinSelectionIndex();
   				    if(selectedRow==0)
   				    {
   				    	Barcelona.setVisible(true);
   				    	Laliga1.setVisible(false);
   				    	
   				    }
   				    
   				    else if(selectedRow==1)
				    {
   				    	AtleticoMadrid.setVisible(true);
   				    	Laliga1.setVisible(false);
				    }
   				    
   				    else if(selectedRow==2)
				    {
   				    	RealMadrid.setVisible(true);
   				    	Laliga1.setVisible(false);
				    }
   				    
   				    else if(selectedRow==3)
				    {
   				    	Valencia.setVisible(true);
   				    	Laliga1.setVisible(false);
				    }
   				    
   				    else if(selectedRow==4)
				    {
   				    	Villarreal.setVisible(true);
   				    	Laliga1.setVisible(false);
				    }
   				    
   				    else if(selectedRow==5)
				    {
				    	Sevilla.setVisible(true);
				    	Laliga1.setVisible(false);
				    }
   				    
   				    else if(selectedRow==6)
				    {
   				    	Girona.setVisible(true);
   				    	Laliga1.setVisible(false);
				    }
   				    
   				    else if(selectedRow==7)
				    {
   				    	RealBetis.setVisible(true);
   				    	Laliga1.setVisible(false);
				    }
   				    
   				    else if(selectedRow==8)
				    {
				    	Getafe.setVisible(true);
   				    	Laliga1.setVisible(false);
				    }
   				    
   				    else if(selectedRow==9)
				    {
   				    	CeltaVigo.setVisible(true);
   				    	Laliga1.setVisible(false);
				    }
   				    
				}
				
			}
			
		});
		
		JLabel Point = new JLabel("Spanish La Liga 2017/18");
		Point.setForeground(Color.WHITE);
		Point.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		Point.setBounds(392, 4, 222, 23);
		Laliga1.add(Point);
		
		Score = new JLabel("Top Scorer");
		Score.setForeground(new Color(128, 128, 0));
		Score.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 18));
		Score.setBounds(466, 269, 106, 28);
		Laliga1.add(Score);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(166, 312, 673, 186);
		Laliga1.add(scrollPane_1);
		
		table_2 = new JTable(row1,col1);
		table_2.setBackground(new Color(186, 85, 211));
		table_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 200, 0), new Color(0, 0, 0), new Color(153, 50, 204), new Color(47, 79, 79)));
		table_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		scrollPane_1.setViewportView(table_2);
		
		JLabel lblNewLabel_165 = new JLabel();
		lblNewLabel_165.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/La-Liga.jpg")));
		lblNewLabel_165.setBounds(0, 4, 1380,920);
		Laliga1.add(lblNewLabel_165);
		
	    BPL1 = new JPanel();
		BPL1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(BPL1);
		
		JButton back2 = new JButton();
		back2.setBounds(10, 11, 16, 16);
		back2.setBackground(Color.WHITE);
		back2.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		back2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.setVisible(true);
				BPL1.setVisible(false);
			}
			
		});
		BPL1.setLayout(null);
		BPL1.add(back2);
		
		    tb=new JTabbedPane();
		    tb.setBounds(25, 50, 1200, 264);
		    BPL1.add(tb);
		
		p1=new JPanel();
		///p1.setSize(1200, 400);
		p1.setForeground(new Color(0, 128, 128));
		tb.addTab("Point-Table",p1);
		p1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 0), new Color(0, 128, 0), new Color(152, 251, 152), new Color(0, 0, 128)));
		p1.setBackground(Color.DARK_GRAY);
		p1.setLayout(null);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 1038, 206);
		p1.add(scrollPane_3);
		table_3 = new JTable(row2,col2);
		scrollPane_3.setViewportView(table_3);
		table_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		
		
		ListSelectionModel m = table_3.getSelectionModel();
		m.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if(! m.isSelectionEmpty())
				{
   				    int s=m.getMinSelectionIndex();
   				    if(s==0)
   				    {
   				    	ManchesterCity.setVisible(true);
   				    	BPL1.setVisible(false);
   				    	
   				    }
   				    
   				    else if(s==1)
				    {
				    	ManchesterUtd.setVisible(true);
				    	BPL1.setVisible(false);
				    	
				    }
   				    
   				 else if(s==2)
				    {
				    	Liverpool.setVisible(true);
				    	BPL1.setVisible(false);
				    	
				    }
   				    
   				else if(s==3)
			    {
			    	Tottenham.setVisible(true);
			    	BPL1.setVisible(false);
			    	
			    }
   				    
   				else if(s==4)
			    {
			    	Chelsea.setVisible(true);
			    	BPL1.setVisible(false);
			    	
			    }
   				    
   				else if(s==5)
			    {
			    	Arsenal.setVisible(true);
			    	BPL1.setVisible(false);
			    	
			    }
   				    
   				else if(s==6)
			    {
			    	Burnley.setVisible(true);
			    	BPL1.setVisible(false);
			    	
			    }
   				    
   				else if(s==7)
			    {
			        LeicesterCity.setVisible(true);
			    	BPL1.setVisible(false);
			    	
			    }
   				    
   				else if(s==8)
			    {
			    	Everton.setVisible(true);
			    	BPL1.setVisible(false);
			    	
			    }
   				    
   				else if(s==9)
			    {
			    	Bournemouth.setVisible(true);
			    	BPL1.setVisible(false);
			    	
			    }
   				    
			  }
				
			}
			
		});
		
		p2=new JPanel();
		p2.setBackground(new Color(192, 192, 192));
		
		tb.addTab("TOP-SCORER", p2);
		p2.setLayout(null);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(23, 11, 705, 207);
		p2.add(scrollPane_4);
		
		table_4 = new JTable(row3,col3);
		table_4.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		scrollPane_4.setViewportView(table_4);
		
		JLabel lblNewLabel_164 = new JLabel();
		lblNewLabel_164.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/bpl4.jpg")));
		lblNewLabel_164.setBounds(0, 0,1380,900);
		BPL1.add(lblNewLabel_164);
		
		Barcelona = new JPanel();
		Barcelona.setBackground(new Color(204, 255, 0));
		frame.getContentPane().add(Barcelona, "name_531135553744731");
		Barcelona.setLayout(null);
		
		JButton b4 = new JButton();
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Barcelona.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		b4.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		b4.setBounds(0,0,30,30);
		Barcelona.add(b4);
		
		JLabel BL1 = new JLabel();
		BL1.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/maxresdefault.jpg")));
		BL1.setBounds(427, 0, 120, 71);
		Barcelona.add(BL1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 126,880, 600);
		Barcelona.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tab2 = new JTabbedPane(JTabbedPane.TOP);
		tab2.setBounds(20, 11,860,504);
		panel.add(tab2);
		
		p3=new JPanel();
		p3.setSize(700, 300);
		p3.setBorder(new CompoundBorder());
		tab2.add(p3);
		
		p4=new JPanel();
		p4.setBackground(new Color(0, 139, 139));
		tab2.add(p4);
		
		tab2.addTab("Players", p3);
		p3.setLayout(null);
		
		JButton Marc = new JButton();
		Marc.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/marc.png")));
		Marc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MarcStegen.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		Marc.setBounds(10, 0, 100, 95);
		p3.add(Marc);
		
		JButton vidal = new JButton();
		vidal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlexVidal.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		vidal.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/vidal.jpg")));
		vidal.setBounds(159, 0, 100,95);
		p3.add(vidal);
		
		JButton alba = new JButton();
		alba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JordiAlba.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		alba.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/alba.jpg")));
		alba.setBounds(301, 0, 100,95);
		p3.add(alba);
		
		JButton gomez = new JButton();
		gomez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AndreGomez.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		gomez.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/gomez.jpg")));
		gomez.setBounds(665, 147, 100,95);
		p3.add(gomez);
		
		JButton coutinho = new JButton();
		coutinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				coutinh.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		coutinho.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/coutinho.jpg")));
		coutinho.setBounds(191, 147, 100,95);
		p3.add(coutinho);
		
		JButton messi = new JButton();
		messi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LionelMessi.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		messi.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/messi.jpg")));
		messi.setBounds(580, 0, 100,95);
		p3.add(messi);
		
		JButton busquets = new JButton();
		busquets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SerBusqets.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		busquets.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/busquets.jpg")));
		busquets.setBounds(24, 147,100,95);
		p3.add(busquets);
		
		JButton suarez = new JButton();
		suarez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LuizSuarez.setVisible(true);
				Barcelona.setVisible(false);
			}
			
		});
		suarez.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/suarez.jpg")));
		suarez.setBounds(719, 0,100,95);
		p3.add(suarez);
		
		JButton pique = new JButton();
		pique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GeradPique.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		pique.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/pique.jpg")));
		pique.setBounds(438, 0, 100,95);
		p3.add(pique);
		
		JButton iniesta = new JButton();
		iniesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AndreIniesta.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		iniesta.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/iniesta.jpg")));
		iniesta.setBounds(350, 147, 100,95);
		p3.add(iniesta);
		
		JButton umiti = new JButton();
		umiti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SamuelUmiti.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		umiti.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/umiti.jpg")));
		umiti.setBounds(507, 147, 100,95);
		p3.add(umiti);
		
		JLabel lblNewLabel_146 = new JLabel();
		lblNewLabel_146.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/barca3.jpg")));
		lblNewLabel_146.setBounds(0, 0, 855, 476);
		p3.add(lblNewLabel_146);
		p3.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{Marc, vidal, alba, gomez, coutinho, messi, busquets, suarez, pique}));
		tab2.addTab("Cup", p4);
		p4.setLayout(null);
		
		JLabel UCL = new JLabel();
		UCL.setBackground(Color.WHITE);
		UCL.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UCL.jpg")));
		UCL.setBounds(34, 11, 120, 123);
		p4.add(UCL);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Europian super cup.jpg")));
		lblNewLabel.setBounds(294, 25,120,100);
		p4.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/la liga.jpg")));
		lblNewLabel_1.setBounds(540, 11, 131,109);
		p4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/fifa_club_world_cup.jpg")));
		lblNewLabel_2.setBounds(167, 271, 120,100);
		p4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/spanish cup.jpg")));
		lblNewLabel_4.setBounds(471,271, 120,100);
		p4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("UCL 5 Times");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(44, 129, 90, 25);
		p4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("European Super Cup 5 Times");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(259, 134, 208, 14);
		p4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("La liga 24 Times");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(550, 131, 120, 14);
		p4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fifa club World cup 3 Times");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(132, 400, 200, 14);
		p4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Spanish Cup 29 Times");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(450, 400, 160, 14);
		p4.add(lblNewLabel_8);
		
		JButton btnNewButton_290 = new JButton("Ernesto Valverde");
		btnNewButton_290.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_290.setBackground(new Color(230, 230, 250));
		btnNewButton_290.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ErnestoValverde.setVisible(true);
				Barcelona.setVisible(false);
			}
		});
		btnNewButton_290.setBounds(401, 93, 171,30);
		Barcelona.add(btnNewButton_290);
		
		JLabel lblNewLabel_148 = new JLabel();
		lblNewLabel_148.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/barca7.jpg")));
		lblNewLabel_148.setBounds(1009, 0, 214, 123);
		Barcelona.add(lblNewLabel_148);
		
		JLabel lblLabel_149 = new JLabel();
		lblLabel_149.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/barca5.jpg")));
		lblLabel_149.setBounds(796, 0, 214, 123);
		Barcelona.add(lblLabel_149);
		
		JLabel lblLabel_151 = new JLabel();
		lblLabel_151.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/barca9.jpg")));
		lblLabel_151.setBounds(582, 0, 200, 123);
		Barcelona.add(lblLabel_151);
		
		JLabel lblLabel_150 = new JLabel();
		lblLabel_150.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/barca8.jpg")));
		lblLabel_150.setBounds(26, 0, 374, 123);
		Barcelona.add(lblLabel_150);
		
		RealMadrid = new JPanel();
		frame.getContentPane().add(RealMadrid, "name_609392662228756");
		RealMadrid.setLayout(null);
		
		btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealMadrid.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		btnNewButton.setBounds(0, 0, 30,30);
		RealMadrid.add(btnNewButton);
		
		JPanel RealPanel = new JPanel();
		RealPanel.setBounds(27, 46, 468, 632);
		RealMadrid.add(RealPanel);
		RealPanel.setLayout(null);
		
		JButton RP1 = new JButton();
		RP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bale.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP1.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP1.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP1.setBounds(334, 44, 100, 85);
		RealPanel.add(RP1);
		
		JButton RP2 = new JButton();
		RP2.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cristianoronaldo.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP2.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP2.setBounds(10, 44, 100, 85);
		RealPanel.add(RP2);
		
		JButton RP3 = new JButton();
		RP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modrich.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP3.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP3.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP3.setBounds(184, 148, 100, 85);
		RealPanel.add(RP3);
		
		JButton RP4 = new JButton();
		RP4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carvajal.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP4.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP4.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP4.setBounds(250, 373, 100,85);
		RealPanel.add(RP4);
		
		JButton RP5 = new JButton();
		RP5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramos.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP5.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP5.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP5.setBounds(140, 373, 100,85);
		RealPanel.add(RP5);
		
		JButton RP6 = new JButton();
		RP6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				casemiro.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP6.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP6.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP6.setBounds(334, 239, 100,85);
		RealPanel.add(RP6);
		
		JButton RP7 = new JButton();
		RP7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navas.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP7.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Navas.jpg")));
		RP7.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP7.setBounds(184, 504, 100, 85);
		RealPanel.add(RP7);
		
		JButton RP8 = new JButton();
		RP8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nacho.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP8.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP8.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP8.setBounds(10, 373, 100, 85);
		RealPanel.add(RP8);
		
		JButton RP9 = new JButton();
		RP9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marcelo.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP9.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP9.setFont(RP9.getFont().deriveFont(RP9.getFont().getStyle() | Font.BOLD));
		RP9.setBounds(360, 373, 100,85);
		RealPanel.add(RP9);
		
		JButton RP10 = new JButton();
		RP10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isco.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP10.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP10.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP10.setBounds(44, 239,100,85);
		RealPanel.add(RP10);
		
		JButton RP11 = new JButton();
		RP11.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Real.jpg")));
		RP11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				benzama.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		RP11.setFont(new Font("Tahoma", Font.BOLD, 11));
		RP11.setBounds(184, 0, 100,85);
		RealPanel.add(RP11);
		
		JLabel lblNewLabel_15 = new JLabel("Cristiano Roanldo");
		lblNewLabel_15.setForeground(SystemColor.activeCaption);
		lblNewLabel_15.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_15.setBounds(10, 140, 100, 14);
		RealPanel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Benzama");
		lblNewLabel_16.setForeground(SystemColor.activeCaption);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_16.setBounds(194, 90, 76, 14);
		RealPanel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Bale");
		lblNewLabel_17.setForeground(SystemColor.activeCaption);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_17.setBounds(360, 140, 46, 14);
		RealPanel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Modric");
		lblNewLabel_18.setForeground(SystemColor.activeCaption);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_18.setBounds(212, 239, 46, 14);
		RealPanel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Isco");
		lblNewLabel_19.setForeground(SystemColor.activeCaption);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_19.setBounds(64, 329, 46, 14);
		RealPanel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Casemiro");
		lblNewLabel_20.setForeground(SystemColor.activeCaption);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_20.setBounds(352, 329, 82, 14);
		RealPanel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Nacho");
		lblNewLabel_21.setForeground(SystemColor.activeCaption);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_21.setBounds(39, 469, 46, 14);
		RealPanel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Ramos");
		lblNewLabel_22.setForeground(SystemColor.activeCaption);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_22.setBounds(170, 469, 46, 14);
		RealPanel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Navas");
		lblNewLabel_23.setForeground(SystemColor.activeCaption);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_23.setBounds(212, 600, 46, 14);
		RealPanel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Carvajal");
		lblNewLabel_24.setForeground(SystemColor.activeCaption);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_24.setBounds(270, 469, 58, 14);
		RealPanel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Marcelo");
		lblNewLabel_25.setForeground(SystemColor.activeCaption);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_25.setBounds(388, 469, 46, 14);
		RealPanel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_156 = new JLabel();
		lblNewLabel_156.setForeground(SystemColor.activeCaption);
		lblNewLabel_156.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/real2.jpg")));
		lblNewLabel_156.setBounds(0, 0, 468,632);
		RealPanel.add(lblNewLabel_156);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(SystemColor.activeCaption);
		panel_18.setBounds(756, 21, 445, 682);
		RealMadrid.add(panel_18);
		panel_18.setLayout(null);
		
		JLabel lblNewLabel_36 = new JLabel();
		lblNewLabel_36.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/FIFA Club of the Century.jpg")));
		lblNewLabel_36.setBounds(10, 11, 120,100);
		panel_18.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel();
		lblNewLabel_37.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UCL.jpg")));
		lblNewLabel_37.setBounds(10, 122,  120,100);
		panel_18.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel();
		lblNewLabel_38.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/la liga.jpg")));
		lblNewLabel_38.setBounds(10, 233, 120,100);
		panel_18.add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel();
		lblNewLabel_39.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/spanish cup.jpg")));
		lblNewLabel_39.setBounds(10, 347,  120,100);
		panel_18.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel();
		lblNewLabel_40.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Europian super cup.jpg")));
		lblNewLabel_40.setBounds(10, 458,  120,100);
		panel_18.add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel();
		lblNewLabel_41.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/fifa_club_world_cup.jpg")));
		lblNewLabel_41.setBounds(10, 569,  120,100);
		panel_18.add(lblNewLabel_41);
		
		JLabel lblNewLabel_59 = new JLabel("FIFA Club Of The Century 1 Times");
		lblNewLabel_59.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_59.setBounds(171, 51, 223, 30);
		panel_18.add(lblNewLabel_59);

		JLabel lb_60 = new JLabel("UCL 12 Times");
		lb_60.setFont(f1);
		lb_60.setBounds(178, 142, 198, 30);
		panel_18.add(lb_60);

		JLabel lb_61 = new JLabel("European super cup-4 times");
		lb_61.setFont(f1);
		lb_61.setBounds(178, 489, 198, 30);
		panel_18.add(lb_61);

		JLabel lb_62 = new JLabel("La liga-33 times");
		lb_62.setFont(f1);
		lb_62.setBounds(171, 254, 198, 30);
		panel_18.add(lb_62);

		JLabel lb_63 = new JLabel("Fifa club world cup-6 times");
		lb_63.setFont(f1);
		lb_63.setBounds(178, 608, 198, 30);
		panel_18.add(lb_63);

		JLabel lb_64 = new JLabel("Spanish cup-19 times");
		lb_64.setFont(f1);
		lb_64.setBounds(171, 388, 198, 30);
		panel_18.add(lb_64);
		
		JButton btnNewButton_287 = new JButton();
		btnNewButton_287.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/Zinedine Zidane1.jpg")));
		btnNewButton_287.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZinedineZidane.setVisible(true);
				RealMadrid.setVisible(false);
			}
		});
		btnNewButton_287.setBounds(563, 11, 120, 100);
		RealMadrid.add(btnNewButton_287);
		
		JLabel lblNewLabel_61 = new JLabel("Zinedine Zidane");
		lblNewLabel_61.setForeground(Color.BLACK);
		lblNewLabel_61.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_61.setBounds(573, 122, 120, 28);
		RealMadrid.add(lblNewLabel_61);
		
		JLabel lblNewLabel_155 = new JLabel("New label");
		lblNewLabel_155.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/real3.jpg")));
		lblNewLabel_155.setBounds(0, 4, 1366,768);
		RealMadrid.add(lblNewLabel_155);
		
		AtleticoMadrid = new JPanel();
		AtleticoMadrid.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(AtleticoMadrid, "name_670370219461067");
		
		JButton btnNewButton_11 = new JButton();
		btnNewButton_11.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_11.setBounds(0, 0, 30,30);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtleticoMadrid.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		AtleticoMadrid.setLayout(null);
		AtleticoMadrid.add(btnNewButton_11);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(22, 194, 659, 457);
		AtleticoMadrid.add(panel_14);
		panel_14.setLayout(null);
		
		JButton btnNewButton_272 = new JButton("Antoine Griezmann");
		btnNewButton_272.setFont(f);
		btnNewButton_272.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AntoineGriezmann.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_272.setBounds(10, 26, 214, 71);
		panel_14.add(btnNewButton_272);
		
		JButton btnNewButton_273 = new JButton("Antonio Montoro");
		btnNewButton_273.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AntonioRodriguez.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_273.setFont(f);
		btnNewButton_273.setBounds(10, 141, 214, 71);
		panel_14.add(btnNewButton_273);
		
		JButton btnNewButton_274 = new JButton("Diego Costa");
		btnNewButton_274.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiegoCosta.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_274.setFont(f);
		btnNewButton_274.setBounds(10, 274,  214, 71);
		panel_14.add(btnNewButton_274);
		
		JButton btnNewButton_275 = new JButton("Fernando Torres");
		btnNewButton_275.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FernandoTorres.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_275.setFont(f);
		btnNewButton_275.setBounds(435, 26, 214, 71);
		panel_14.add(btnNewButton_275);
		
		JButton btnNewButton_276 = new JButton("Filipe Luis");
		btnNewButton_276.setFont(f);
		btnNewButton_276.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FilipeLuis.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_276.setBounds(435, 141,  214, 71);
		panel_14.add(btnNewButton_276);
		
		
		JButton btnNewButton_278 = new JButton("Gabriel Fernández");
		btnNewButton_278.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GabrielFernandez.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_278.setFont(f);
		btnNewButton_278.setBounds(223, 274,  214, 71);
		panel_14.add(btnNewButton_278);
		
		JButton btnNewButton_279 = new JButton("Antonio Moya");
		btnNewButton_279.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AntonioMoya.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_279.setFont(f);
		btnNewButton_279.setBounds(223, 208,  214, 71);
		panel_14.add(btnNewButton_279);
		
		JButton btnNewButton_280 = new JButton("Lucas Hernández");
		btnNewButton_280.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lucasbernard.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_280.setFont(f);
		btnNewButton_280.setBounds(223, 141, 214, 71);
		panel_14.add(btnNewButton_280);
		
		JButton btnNewButton_281 = new JButton("Jan Oblak");
		btnNewButton_281.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janoblak.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_281.setFont(f);
		btnNewButton_281.setBounds(435, 274,  188, 71);
		panel_14.add(btnNewButton_281);
		
		JButton btnNewButton_282 = new JButton("Juan Francisco");
		btnNewButton_282.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juanfrancisco.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_282.setFont(f);
		btnNewButton_282.setBounds(223, 26, 214, 71);
		panel_14.add(btnNewButton_282);
		
		JButton btnNewButton_283 = new JButton("Koke");
		btnNewButton_283.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				koke.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_283.setFont(f);
		btnNewButton_283.setBounds(223, 342,  214, 71);
		panel_14.add(btnNewButton_283);
		
		JLabel lblNewLabel_147 = new JLabel("");
		lblNewLabel_147.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/at1.jpg")));
		lblNewLabel_147.setBounds(0, 0, 670, 457);
		panel_14.add(lblNewLabel_147);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.RED);
		panel_15.setBounds(797, 140, 381, 544);
		AtleticoMadrid.add(panel_15);
		panel_15.setLayout(null);
		
		JLabel lblNewLabel_26 = new JLabel();
		lblNewLabel_26.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UCL.jpg")));
		lblNewLabel_26.setBounds(10, 11, 120,100);
		panel_15.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel();
		lblNewLabel_27.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/la liga.jpg")));
		lblNewLabel_27.setBounds(10, 154, 120,100);
		panel_15.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel();
		lblNewLabel_28.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/spanish cup.jpg")));
		lblNewLabel_28.setBounds(10, 302,120,100);
		panel_15.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel();
		lblNewLabel_29.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Europian super cup.jpg")));
		lblNewLabel_29.setBounds(20, 433, 120,100);
		panel_15.add(lblNewLabel_29);
		
		JButton btnNewButton_286 = new JButton();
		btnNewButton_286.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Diegosimeone.setVisible(true);
				AtleticoMadrid.setVisible(false);
			}
		});
		btnNewButton_286.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/diego simeone.jpg")));
		btnNewButton_286.setBounds(528, 11, 122, 101);
		AtleticoMadrid.add(btnNewButton_286);
		
		JLabel lblNewLabel_60 = new JLabel("Diego simeone");
		lblNewLabel_60.setForeground(Color.WHITE);
		lblNewLabel_60.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_60.setBounds(538, 123, 112, 23);
		AtleticoMadrid.add(lblNewLabel_60);
		
		JLabel lb_65 = new JLabel("UCL-Runners-up 3 times");
		lb_65.setForeground(Color.WHITE);
		lb_65.setFont(f1);
		lb_65.setBounds(169, 42, 160,40);
		panel_15.add(lb_65);

		JLabel lb_66 = new JLabel("UEFA/European super cup-2 times");
		lb_66.setForeground(Color.WHITE);
		lb_66.setFont(f1);
		lb_66.setBounds(169, 464,202,40);
		panel_15.add(lb_66);
		
		JLabel lb_67 = new JLabel("La liga-10 times");
		lb_67.setForeground(Color.WHITE);
		lb_67.setFont(f1);
		lb_67.setBounds(178, 189, 160,40);
		panel_15.add(lb_67);

		JLabel lb_68 = new JLabel("Spanish cup-10 times");
		lb_68.setForeground(Color.WHITE);
		lb_68.setFont(f1);
		lb_68.setBounds(178, 329, 160,40);
		panel_15.add(lb_68);
		
		JLabel lblNewLabel_149 = new JLabel();
		lblNewLabel_149.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/at3.png")));
		lblNewLabel_149.setBounds(0, 4, 1300, 750);
		AtleticoMadrid.add(lblNewLabel_149);
		
	    Valencia = new JPanel();
	    Valencia.setBackground(Color.WHITE);
		frame.getContentPane().add(Valencia, "name_670402707152140");
		Valencia.setLayout(null);
		
		JButton btnNewButton_12 = new JButton();
		btnNewButton_12.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valencia.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		btnNewButton_12.setBounds(0, 0,30,30);
		Valencia.add(btnNewButton_12);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 153, 0));
		panel_9.setBounds(225, 193, 260, 414);
		Valencia.add(panel_9);
		panel_9.setLayout(null);
		
		JButton btnNewButton_129 = new JButton("Cooquelin");
		btnNewButton_129.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_129.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cooquelin.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_129.setBounds(0, 11,100,50);
		panel_9.add(btnNewButton_129);
		
		JButton btnNewButton_130 = new JButton("Garay");
		btnNewButton_130.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				garay.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_130.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_130.setBounds(136, 11,100,50);
		panel_9.add(btnNewButton_130);
		
		JButton btnNewButton_131 = new JButton("Gayaa");
		btnNewButton_131.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gayaa.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_131.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_131.setBounds(0, 67, 100,50);
		panel_9.add(btnNewButton_131);
		
		JButton btnNewButton_132 = new JButton("Guedess");
		btnNewButton_132.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guedess.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_132.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_132.setBounds(136, 67, 100,50);
		panel_9.add(btnNewButton_132);
		
		JButton btnNewButton_133 = new JButton("Kondogbia");
		btnNewButton_133.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kondogbia.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_133.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_133.setBounds(0, 132,100,50);
		panel_9.add(btnNewButton_133);
		
		JButton btnNewButton_134 = new JButton("Latoo");
		btnNewButton_134.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				latoo.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_134.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_134.setBounds(136, 132, 100,50);
		panel_9.add(btnNewButton_134);
		
		JButton btnNewButton_135 = new JButton("Mina");
		btnNewButton_135.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mina.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_135.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnNewButton_135.setBounds(0, 202, 100,50);
		panel_9.add(btnNewButton_135);
		
		JButton btnNewButton_136 = new JButton("Montoyaa");
		btnNewButton_136.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				montoyaa.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_136.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_136.setBounds(136, 202, 100,50);
		panel_9.add(btnNewButton_136);
		
		JButton btnNewButton_137 = new JButton("Netoo");
		btnNewButton_137.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				neto.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_137.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnNewButton_137.setBounds(0, 266, 100,50);
		panel_9.add(btnNewButton_137);
		
		JButton btnNewButton_138 = new JButton("Parejoo");
		btnNewButton_138.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Parejo.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_138.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_138.setBounds(136, 266,100,50);
		panel_9.add(btnNewButton_138);
		
		JButton btnNewButton_139 = new JButton("Rodrogoo");
		btnNewButton_139.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rodrogoo.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_139.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnNewButton_139.setBounds(65, 331, 100,50);
		panel_9.add(btnNewButton_139);
		
		JFormattedTextField frmtdtxtfldMina = new JFormattedTextField();
		frmtdtxtfldMina.setText("mina");
		frmtdtxtfldMina.setBounds(25, 217, 6, 20);
		panel_9.add(frmtdtxtfldMina);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(204, 153, 255));
		panel_17.setBounds(650, 193, 426, 414);
		Valencia.add(panel_17);
		panel_17.setLayout(null);
		
		JLabel lblNewLabel_32 = new JLabel();
		lblNewLabel_32.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UCL.jpg")));
		lblNewLabel_32.setBounds(273, 11, 120,100);
		panel_17.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel();
		lblNewLabel_33.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Europian super cup.jpg")));
		lblNewLabel_33.setBounds(25, 11, 120,100);
		panel_17.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel();
		lblNewLabel_34.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/la liga.jpg")));
		lblNewLabel_34.setBounds(10, 247, 120,100);
		panel_17.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel();
		lblNewLabel_35.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/spanish cup.jpg")));
		lblNewLabel_35.setBounds(273, 247, 120,100);
		panel_17.add(lblNewLabel_35);
		
		JButton btnNewButton_288 = new JButton();
		btnNewButton_288.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/Marcelino Garc\u00EDa.jpg")));
		btnNewButton_288.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarcelinoGarcía.setVisible(true);
				Valencia.setVisible(false);
			}
		});
		btnNewButton_288.setBounds(537, 11, 119, 102);
		Valencia.add(btnNewButton_288);
		
		JLabel lblNewLabel_62 = new JLabel("Marcelino Garc\u00EDa");
		lblNewLabel_62.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_62.setBounds(535, 124, 131, 23);
		Valencia.add(lblNewLabel_62);
		
		JLabel lb_69 = new JLabel("UCL-Runners-up 2 times");
		lb_69.setFont(f1);
		lb_69.setBounds(256, 135, 160,40);
		panel_17.add(lb_69);

		JLabel lb_70 = new JLabel("European super cup-2 times");
		lb_70.setFont(f1);
		lb_70.setBounds(10, 135, 178,40);
		panel_17.add(lb_70);

		JLabel lb_71 = new JLabel("La liga-6 times");
		lb_71.setFont(f1);
		lb_71.setBounds(28, 358, 160,40);
		panel_17.add(lb_71);

		JLabel lb_72 = new JLabel("Spanish cup-7 times");
		lb_72.setFont(f1);
		lb_72.setBounds(273, 358, 160,40);
		panel_17.add(lb_72);
		
		JLabel lblNewLabel_166 = new JLabel("");
		lblNewLabel_166.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/valencia_c_f.jpg")));
		lblNewLabel_166.setBounds(0, 0, 1200, 900);
		Valencia.add(lblNewLabel_166);
		 
		 Parejo = new JPanel();
		 Parejo.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(Parejo, "name_846892337959830");
		 Parejo.setLayout(null);
		 
		 JButton btnNewButton_152 = new JButton();
		 btnNewButton_152.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_152.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Parejo.setVisible(false);
		 		Valencia.setVisible(true);
		 	}
		 });
		 btnNewButton_152.setBounds(0, 0,30,30);
		 Parejo.add(btnNewButton_152);
		 
		 list_1 = new JList(names);
		 list_1.setBackground(SystemColor.inactiveCaption);
		 list_1.setFont(f);
		 list_1.setBounds(21, 52, 330, 124);
		 Parejo.add(list_1);
		 
		 JLabel lblNewLabel_12 = new JLabel();
		 lblNewLabel_12.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/valencia/parejoo.jpg")));
		 lblNewLabel_12.setBounds(453, 54, 172, 144);
		 Parejo.add(lblNewLabel_12);
		 
		 cooquelin = new JPanel();
		 cooquelin.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(cooquelin, "name_846933683108152");
		 cooquelin.setLayout(null);
		 
		 JButton btnNewButton_153 = new JButton();
		 btnNewButton_153.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_153.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		cooquelin.setVisible(false);
			 		Valencia.setVisible(true);
			 	}
			 });
		 btnNewButton_153.setBounds(0, 0, 30,30);
		 cooquelin.add(btnNewButton_153);
		 
		 JList list_2 = new JList(v1);
		 list_2.setFont(f);
		 list_2.setBounds(27, 48, 354,117);
		 cooquelin.add(list_2);
		 
		 JLabel lblNewLabel_97 = new JLabel();
		 lblNewLabel_97.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/cooquelin (2).jpg")));
		 lblNewLabel_97.setBounds(510, 41, 120, 100);
		 cooquelin.add(lblNewLabel_97);
		 
		 mina = new JPanel();
		 mina.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(mina, "name_847499914575214");
		 mina.setLayout(null);
		 
		 JButton btnNewButton_154 = new JButton();
		 btnNewButton_154.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_154.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		mina.setVisible(false);
			 		Valencia.setVisible(true);
			 	}
			 });
		 btnNewButton_154.setBounds(0, 0,30,30);
		 mina.add(btnNewButton_154);
		 
		 JLabel lblNewLabel_98 = new JLabel();
		 lblNewLabel_98.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/mina (2).jpg")));
		 lblNewLabel_98.setBounds(510, 41, 147, 116);
		 mina.add(lblNewLabel_98);
		 
		 JList list_82 = new JList(va10);
		 list_82.setBounds(107, 57, 324,100);
		 mina.add(list_82);
		 
		 garay = new JPanel();
		 garay.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(garay, "name_846948147115344");
		 garay.setLayout(null);
		 
		 JButton btnNewButton_155 = new JButton();
		 btnNewButton_155.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_155.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		garay.setVisible(false);
			 		Valencia.setVisible(true);
			 	}
			 });
		 btnNewButton_155.setBounds(0, 0, 30,30);
		 garay.add(btnNewButton_155);
		 
		 JLabel lblNewLabel_99 = new JLabel();
		 lblNewLabel_99.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/garay (2).jpg")));
		 lblNewLabel_99.setBounds(510, 41, 120, 100);
		 garay.add(lblNewLabel_99);
		 
		 JList list_78 = new JList(va2);
		 list_78.setBounds(100, 57, 300,80);
		 garay.add(list_78);
		 
		 gayaa = new JPanel();
		 gayaa.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(gayaa, "name_846960668721354");
		 gayaa.setLayout(null);
		 
		 JButton btnNewButton_156 = new JButton();
		 btnNewButton_156.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_156.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		gayaa.setVisible(false);
		 		Valencia.setVisible(true);
		 	}
		 });
		 btnNewButton_156.setBounds(0, 0, 30,30);
		 gayaa.add(btnNewButton_156);
		 
		 JLabel lblNewLabel_100 = new JLabel();
		 lblNewLabel_100.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/gayaa (2).jpg")));
		 lblNewLabel_100.setBounds(510, 41, 120, 100);
		 gayaa.add(lblNewLabel_100);
		 
		 JList list_87 = new JList(va5);
		 list_87.setBounds(84, 34,300,80);
		 gayaa.add(list_87);
		 
		 neto = new JPanel();
		 neto.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(neto, "name_846963515222639");
		 neto.setLayout(null);
		 
		 JButton btnNewButton_157 = new JButton();
		 btnNewButton_157.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_157.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		neto.setVisible(false);
			 		Valencia.setVisible(true);
			 	}
			 });
		 btnNewButton_157.setBounds(0, 11, 89, 23);
		 neto.add(btnNewButton_157);
		 
		 JLabel lblNewLabel_101 = new JLabel();
		 lblNewLabel_101.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/netoo (2).jpg")));
		 lblNewLabel_101.setBounds(510, 41, 120, 100);
		 neto.add(lblNewLabel_101);
		 
		 JList list_84 = new JList(va7);
		 list_84.setBounds(106, 57, 300,80);
		 neto.add(list_84);
		 
		 guedess = new JPanel();
		 guedess.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(guedess, "name_846966049573631");
		 guedess.setLayout(null);
		 
		 JButton btnNewButton_158 = new JButton();
		 btnNewButton_158.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_158.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		guedess.setVisible(false);
			 		Valencia.setVisible(true);
			 	}
			 });
		 btnNewButton_158.setBounds(10, 11, 89, 23);
		 guedess.add(btnNewButton_158);
		 
		 JLabel lblNewLabel_102 = new JLabel();
		 lblNewLabel_102.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/guedess (2).jpg")));
		 lblNewLabel_102.setBounds(510, 41, 120, 100);
		 guedess.add(lblNewLabel_102);
		 
		 JList list_79 = new JList(va4);
		 list_79.setBounds(110, 61, 300,80);
		 guedess.add(list_79);
		 
		  kondogbia = new JPanel();
		  kondogbia.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(kondogbia, "name_846993276493698");
		 kondogbia.setLayout(null);
		 
		 JButton btnNewButton_159 = new JButton();
         btnNewButton_159.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));;
		 btnNewButton_159.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 	    kondogbia.setVisible(false);
			 		Valencia.setVisible(true);
			 	}
			 });
		 btnNewButton_159.setBounds(0, 11,30,30);
		 kondogbia.add(btnNewButton_159);
		 
		 JLabel lblNewLabel_103 = new JLabel();
		 lblNewLabel_103.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/kondogbia (2).jpg")));
		 lblNewLabel_103.setBounds(510, 41, 120, 100);
		 kondogbia.add(lblNewLabel_103);
		 
		 JList list_80 = new JList(va3);
		 list_80.setBounds(88, 64, 300,80);
		 kondogbia.add(list_80);
		 
		 latoo = new JPanel();
		 latoo.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(latoo, "name_846996313681602");
		 latoo.setLayout(null);
		 
		 JButton btnNewButton_160 = new JButton();
		 btnNewButton_160.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_160.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 	   latoo.setVisible(false);
			 		Valencia.setVisible(true);
			 	}
			 });
		 btnNewButton_160.setBounds(0, 11, 30,30);
		 latoo.add(btnNewButton_160);
		 
		 JLabel lblNewLabel_104 = new JLabel();
		 lblNewLabel_104.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/latoo (3).jpg")));
		 lblNewLabel_104.setBounds(519, 68, 120, 100);
		 latoo.add(lblNewLabel_104);
		 
		 JList list_81 = new JList(va11);
		 list_81.setBounds(110, 68, 345,100);
		 latoo.add(list_81);
		 
		 rodrogoo = new JPanel();
		 rodrogoo.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(rodrogoo, "name_847009242516040");
		 rodrogoo.setLayout(null);
		 
		 JButton btnNewButton_161 = new JButton();
		 btnNewButton_161.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_161.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		rodrogoo.setVisible(false);
			 		Valencia.setVisible(true);
			 	}
			 });
		 btnNewButton_161.setBounds(10, 11, 30,30);
		 rodrogoo.add(btnNewButton_161);
		 
		 JLabel lblNewLabel_105 = new JLabel();
		 lblNewLabel_105.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/rodrogoo (2).jpg")));
		 lblNewLabel_105.setBounds(510, 41, 120, 100);
		 rodrogoo.add(lblNewLabel_105);
		 
		 JList lit_82 = new JList(va9);
		 lit_82.setBounds(110, 68, 300,80);
		 rodrogoo.add(lit_82);
		 
		 montoyaa = new JPanel();
		 montoyaa.setBackground(SystemColor.inactiveCaption);
		 frame.getContentPane().add(montoyaa, "name_847012299899391");
		 montoyaa.setLayout(null);
		 
		 JButton btnNewButton_162 = new JButton();
		 btnNewButton_162.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_162.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 	    montoyaa.setVisible(false);
			 		Valencia.setVisible(true);
			 	}
			 });
		 btnNewButton_162.setBounds(0, 11, 30,30);
		 montoyaa.add(btnNewButton_162);
		 
		 JLabel lblNewLabel_106 = new JLabel();
		 lblNewLabel_106.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Valen/montoyaa (2).jpg")));
		 lblNewLabel_106.setBounds(510, 41, 120, 100);
		 montoyaa.add(lblNewLabel_106);
		 
		 JList list_83 = new JList(va6);
		 list_83.setBounds(105, 58, 300,80);
		 montoyaa.add(list_83);
		 
		 Villarreal = new JPanel();
		 Villarreal.setBackground(Color.YELLOW);
		frame.getContentPane().add(Villarreal, "name_670436762265194");
		Villarreal.setLayout(null);
		
		JButton btnNewButton_13 = new JButton();
		btnNewButton_13.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Villarreal.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		btnNewButton_13.setBounds(0, 0, 89, 23);
		Villarreal.add(btnNewButton_13);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 102, 255));
		panel_10.setBounds(38, 214, 624, 195);
		Villarreal.add(panel_10);
		panel_10.setLayout(null);
		
		JButton btnNewButton_140 = new JButton("Alvero");
		btnNewButton_140.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_140.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alvero.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_140.setBounds(10, 0, 100,60);
		panel_10.add(btnNewButton_140);
		
		JButton btnNewButton_141 = new JButton("Manuel");
		btnNewButton_141.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manuel.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_141.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_141.setBounds(173, 0, 100,60);
		panel_10.add(btnNewButton_141);
		
		JButton btnNewButton_142 = new JButton("Andres");
		btnNewButton_142.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				andres.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_142.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_142.setBounds(10, 66,100,60);
		panel_10.add(btnNewButton_142);
		
		JButton btnNewButton_143 = new JButton("Pablo");
		btnNewButton_143.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pablo.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_143.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_143.setBounds(173, 66, 100,60);
		panel_10.add(btnNewButton_143);
		
		JButton btnNewButton_144 = new JButton("Soriano");
		btnNewButton_144.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soriano.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_144.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_144.setBounds(334, 0, 100,60);
		panel_10.add(btnNewButton_144);
		
		JButton btnNewButton_145 = new JButton("Jaume");
		btnNewButton_145.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jaume.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_145.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_145.setBounds(10, 133, 100,60);
		panel_10.add(btnNewButton_145);
		
		JButton btnNewButton_146 = new JButton("Mario");
		btnNewButton_146.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mario.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_146.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_146.setBounds(173, 133, 100,60);
		panel_10.add(btnNewButton_146);
		
		JButton btnNewButton_147 = new JButton("Samuel");
		btnNewButton_147.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_147.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				samuel.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_147.setBounds(334, 133, 100,60);
		panel_10.add(btnNewButton_147);
		
		JButton btnNewButton_148 = new JButton("V\u00EDctor Moya");
		btnNewButton_148.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				victor.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_148.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_148.setBounds(491, 92, 129,60);
		panel_10.add(btnNewButton_148);
		
		JButton btnNewButton_149 = new JButton("Rodri");
		btnNewButton_149.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rodri.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_149.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_149.setBounds(334, 66, 100,60);
		panel_10.add(btnNewButton_149);
		
		JButton btnNewButton_150 = new JButton("Carlos Bacca");
		btnNewButton_150.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carlosbacca.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_150.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_150.setBounds(491, 21, 129,60);
		panel_10.add(btnNewButton_150);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 0, 51));
		panel_16.setBounds(38, 459, 453, 267);
		Villarreal.add(panel_16);
		panel_16.setLayout(null);
		
		JLabel lblNewLabel_30 = new JLabel();
		lblNewLabel_30.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/la liga.jpg")));
		lblNewLabel_30.setBounds(40, 35, 120,100);
		panel_16.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel();
		lblNewLabel_31.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UEFA intertoto Cup.jpg")));
		lblNewLabel_31.setBounds(276, 35, 120,100);
		panel_16.add(lblNewLabel_31);
		
		JButton btnNewButton_289 = new JButton();
		btnNewButton_289.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/javier calleja.jpg")));
		btnNewButton_289.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Javiercalleja.setVisible(true);
				Villarreal.setVisible(false);
			}
		});
		btnNewButton_289.setBounds(498, 11, 120, 99);
		Villarreal.add(btnNewButton_289);
		
		JLabel lblNewLabel_63 = new JLabel("Javier Calleja");
		lblNewLabel_63.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_63.setBounds(508, 121, 124, 23);
		Villarreal.add(lblNewLabel_63);
		
		JLabel lb_73 = new JLabel("La liga-Runners-up 1 times");
		lb_73.setFont(f1);
		lb_73.setBounds(27, 160, 160,40);
		panel_16.add(lb_73);

		JLabel lb_74 = new JLabel("UEFA Intertoto cup-2 times");
		lb_74.setFont(f1);
		lb_74.setBounds(264, 160, 160,40);
		panel_16.add(lb_74);
		
		Sevilla = new JPanel();
		frame.getContentPane().add(Sevilla, "name_670461730435806");
		Sevilla.setLayout(null);
		
		JButton btnNewButton_14 = new JButton();
		btnNewButton_14.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sevilla.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		btnNewButton_14.setBounds(0, 0, 30,30);
		Sevilla.add(btnNewButton_14);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(39, 34, 294, 425);
		Sevilla.add(panel_8);
		panel_8.setLayout(null);
		
		JButton btnNewButton_118 = new JButton("Cl\u00E9ment Lenglet");
		btnNewButton_118.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_118.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_118.setBounds(59, 0, 168,50);
		panel_8.add(btnNewButton_118);
		
		JButton btnNewButton_119 = new JButton("\u00C9ver Banega");
		btnNewButton_119.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_119.setBounds(0, 62, 119,50);
		panel_8.add(btnNewButton_119);
		
		JButton btnNewButton_120 = new JButton("Gabriel Mercado");
		btnNewButton_120.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_120.setBounds(142, 62, 131,50);
		panel_8.add(btnNewButton_120);
		
		JButton btnNewButton_121 = new JButton("Jes\u00FAs Navas");
		btnNewButton_121.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_121.setBounds(0, 125,119,50);
		panel_8.add(btnNewButton_121);
		
		JButton btnNewButton_122 = new JButton("Luis Muriel");
		btnNewButton_122.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_122.setBounds(173, 125, 110,50);
		panel_8.add(btnNewButton_122);
		
		JButton btnNewButton_123 = new JButton("Pablo Sarabia");
		btnNewButton_123.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_123.setBounds(59, 186, 154,50);
		panel_8.add(btnNewButton_123);
		
		JButton btnNewButton_124 = new JButton("Nolito");
		btnNewButton_124.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_124.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_124.setBounds(0, 244, 100,50);
		panel_8.add(btnNewButton_124);
		
		JButton btnNewButton_125 = new JButton("S\u00E9bastien Corchia");
		btnNewButton_125.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_125.setBounds(124, 244, 149,50);
		panel_8.add(btnNewButton_125);
		
		JButton btnNewButton_126 = new JButton("Sergio Escudero");
		btnNewButton_126.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_126.setBounds(0, 302, 149,50);
		panel_8.add(btnNewButton_126);
		
		JButton btnNewButton_127 = new JButton("sergio rico");
		btnNewButton_127.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_127.setBounds(173, 302, 100,50);
		panel_8.add(btnNewButton_127);
		
		JButton btnNewButton_128 = new JButton("Wissam Ben Yedder");
		btnNewButton_128.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_128.setBounds(55, 371, 172,50);
		panel_8.add(btnNewButton_128);
		
		Girona = new JPanel();
		frame.getContentPane().add(Girona, "name_670530112208831");
		Girona.setLayout(null);
		
		JButton btnNewButton_15 = new JButton();
		btnNewButton_15.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Girona.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		btnNewButton_15.setBounds(0, 0,30,30);
		Girona.add(btnNewButton_15);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(44, 45, 244, 430);
		Girona.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnNewButton_107 = new JButton("Aday");
		btnNewButton_107.setBounds(128, 47,100,50);
		panel_7.add(btnNewButton_107);
		
		JButton btnNewButton_108 = new JButton("Alex");
		btnNewButton_108.setBounds(10, 47, 100,50);
		panel_7.add(btnNewButton_108);
		
		JButton btnNewButton_109 = new JButton("Andr\u00E9s Guardado");
		btnNewButton_109.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_109.setBounds(60, 0,132,50);
		panel_7.add(btnNewButton_109);
		
		JButton btnNewButton_110 = new JButton("Bernardo");
		btnNewButton_110.setBounds(10, 108, 118,50);
		panel_7.add(btnNewButton_110);
		
		JButton btnNewButton_111 = new JButton("Borja Garc\u00EDa");
		btnNewButton_111.setBounds(138, 108, 100,50);
		panel_7.add(btnNewButton_111);
		
		JButton btnNewButton_112 = new JButton("Cristhian");
		btnNewButton_112.setBounds(10, 206, 100,50);
		panel_7.add(btnNewButton_112);
		
		JButton btnNewButton_113 = new JButton("Johan Mojica");
		btnNewButton_113.setBounds(75, 256, 117, 50);
		panel_7.add(btnNewButton_113);
		
		JButton btnNewButton_114 = new JButton("Juanpe");
		btnNewButton_114.setBounds(128, 206, 100,50);
		panel_7.add(btnNewButton_114);
		
		JButton btnNewButton_115 = new JButton("Olarenwaju Kayode");
		btnNewButton_115.setBounds(60, 157, 149, 50);
		panel_7.add(btnNewButton_115);
		
		JButton btnNewButton_116 = new JButton("Pablo Maffeo");
		btnNewButton_116.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_116.setBounds(75, 308, 117, 50);
		panel_7.add(btnNewButton_116);
		
		JButton btnNewButton_117 = new JButton("Iraizoz");
		btnNewButton_117.setBounds(75, 358,100,50);
		panel_7.add(btnNewButton_117);
		
		 RealBetis = new JPanel();
		frame.getContentPane().add(RealBetis, "name_670532999907413");
		RealBetis.setLayout(null);
		
		JButton btnNewButton_16 = new JButton();
		btnNewButton_16.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealBetis.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		btnNewButton_16.setBounds(0,0,30,30);
		RealBetis.add(btnNewButton_16);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(37, 55, 219, 420);
		RealBetis.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_85 = new JButton("Aissa Mandi");
		btnNewButton_85.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_85.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_85.setBounds(0, 0, 135,40);
		panel_5.add(btnNewButton_85);
		
		JButton btnNewButton_86 = new JButton("antonio adan");
		btnNewButton_86.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_86.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_86.setBounds(0, 34, 135,40);
		panel_5.add(btnNewButton_86);
		
		JButton btnNewButton_87 = new JButton("Andr\u00E9s Guardado");
		btnNewButton_87.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_87.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_87.setBounds(0, 71, 144, 40);
		panel_5.add(btnNewButton_87);
		
		JButton btnNewButton_88 = new JButton("Antonio Barrag\u00E1n");
		btnNewButton_88.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_88.setBounds(0, 105, 156,40);
		panel_5.add(btnNewButton_88);
		
		JButton btnNewButton_89 = new JButton("Cristian Tello");
		btnNewButton_89.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_89.setBounds(0, 142,135,40);
		panel_5.add(btnNewButton_89);
		
		JButton btnNewButton_90 = new JButton("Javi Garc\u00EDa");
		btnNewButton_90.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_90.setBounds(0, 180, 100,40);
		panel_5.add(btnNewButton_90);
		
		JButton btnNewButton_91 = new JButton("Jordi Amat");
		btnNewButton_91.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_91.setBounds(0, 218,100,40);
		panel_5.add(btnNewButton_91);
		
		JButton btnNewButton_92 = new JButton("Riza Durmisi");
		btnNewButton_92.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_92.setBounds(0, 257, 144,40);
		panel_5.add(btnNewButton_92);
		
		JButton btnNewButton_93 = new JButton("Sergio Le\u00F3n");
		btnNewButton_93.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_93.setBounds(0, 295, 124,40);
		panel_5.add(btnNewButton_93);
		
		JButton btnNewButton_94 = new JButton("V\u00EDctor Camarasa");
		btnNewButton_94.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_94.setBounds(0, 329, 135,40);
		panel_5.add(btnNewButton_94);
		
		JButton btnNewButton_95 = new JButton("Joaqu\u00EDn");
		btnNewButton_95.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_95.setBounds(0, 369, 100,40);
		panel_5.add(btnNewButton_95);
		
		 Getafe = new JPanel();
		frame.getContentPane().add(Getafe, "name_670535656596747");
		Getafe.setLayout(null);
		
		JButton btnNewButton_17 = new JButton();
		btnNewButton_17.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Getafe.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		btnNewButton_17.setBounds(0, 0,30,30);
		Getafe.add(btnNewButton_17);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(20, 265, 654, 210);
		Getafe.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton_96 = new JButton("Dami\u00E1n Su\u00E1rez");
		btnNewButton_96.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_96.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_96.setBounds(154, 11, 123, 50);
		panel_6.add(btnNewButton_96);
		
		JButton btnNewButton_97 = new JButton("Amath");
		btnNewButton_97.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_97.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_97.setBounds(15, 11, 100, 50);
		panel_6.add(btnNewButton_97);
		
		JButton btnNewButton_98 = new JButton("Djen\u00E9");
		btnNewButton_98.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_98.setBounds(165, 72, 100, 50);
		panel_6.add(btnNewButton_98);
		
		JButton btnNewButton_99 = new JButton("Francisco Portillo");
		btnNewButton_99.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_99.setBounds(227, 133, 137, 50);
		panel_6.add(btnNewButton_99);
		
		JButton btnNewButton_100 = new JButton("cala");
		btnNewButton_100.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_100.setBounds(15, 72, 100, 50);
		panel_6.add(btnNewButton_100);
		
		JButton btnNewButton_101 = new JButton("Vitorino Antunes");
		btnNewButton_101.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_101.setBounds(494, 11, 137, 50);
		panel_6.add(btnNewButton_101);
		
		JButton btnNewButton_102 = new JButton("Markel Bergara");
		btnNewButton_102.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_102.setBounds(319, 11, 123, 50);
		panel_6.add(btnNewButton_102);
		
		JButton btnNewButton_103 = new JButton("vicente");
		btnNewButton_103.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_103.setBounds(494, 72,100, 50);
		panel_6.add(btnNewButton_103);
		
		JButton btnNewButton_104 = new JButton("Jorge Molina");
		btnNewButton_104.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_104.setBounds(25, 133,128, 50);
		panel_6.add(btnNewButton_104);
		
		JButton btnNewButton_105 = new JButton("Portillo");
		btnNewButton_105.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_105.setBounds(428, 133, 100, 50);
		panel_6.add(btnNewButton_105);
		
		JButton btnNewButton_106 = new JButton("Mauro Arambarr");
		btnNewButton_106.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_106.setBounds(319, 72, 134, 50);
		panel_6.add(btnNewButton_106);
		
		 CeltaVigo = new JPanel();
		frame.getContentPane().add(CeltaVigo, "name_670563610855442");
		CeltaVigo.setLayout(null);
		
		JButton btnNewButton_18 = new JButton();
		btnNewButton_18.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CeltaVigo.setVisible(false);
				Laliga1.setVisible(true);
			}
		});
		btnNewButton_18.setBounds(0, 0,30,30);
		CeltaVigo.add(btnNewButton_18);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(50, 59, 187, 389);
		CeltaVigo.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_74 = new JButton("Andreu Fontas");
		btnNewButton_74.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_74);
		
		JButton btnNewButton_75 = new JButton("Daniel Was");
		btnNewButton_75.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_75);
		
		JButton btnNewButton_76 = new JButton("Gustavo Cabral");
		btnNewButton_76.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_76);
		
		JButton btnNewButton_77 = new JButton("Hugo Mallo");
		btnNewButton_77.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_77);
		
		JButton btnNewButton_78 = new JButton("Jonny");
		btnNewButton_78.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_78);
		
		JButton btnNewButton_79 = new JButton("Maxi Gomez");
		btnNewButton_79.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnNewButton_79);
		
		JButton btnNewButton_80 = new JButton("Pablo Hernandez");
		btnNewButton_80.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_80);
		
		JButton btnNewButton_81 = new JButton("Pione Sisto");
		btnNewButton_81.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_81);
		
		JButton btnNewButton_82 = new JButton("Ruben Blanco");
		btnNewButton_82.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_82);
		
		JButton btnNewButton_83 = new JButton("Stanislav Lobotka");
		btnNewButton_83.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_83);
		
		JButton btnNewButton_84 = new JButton("Diego Alende");
		btnNewButton_84.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton_84);
		
		 ManchesterCity = new JPanel();
		 ManchesterCity.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(ManchesterCity, "name_692973819273078");
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_2.setBounds(0, 0,30,30);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManchesterCity.setVisible(false);
				BPL1.setVisible(true);
			}
		});
		ManchesterCity.setLayout(null);
		ManchesterCity.add(btnNewButton_2);
		
		JButton btnNewButton_215 = new JButton();
		btnNewButton_215.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/Josep Guardiola.jpg")));
		btnNewButton_215.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JosepGuardiola.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		btnNewButton_215.setBounds(452, 11, 128, 94);
		ManchesterCity.add(btnNewButton_215);
		
		JLabel lblNewLabel_13 = new JLabel("Josep Guardiola");
		lblNewLabel_13.setFont(f);
		lblNewLabel_13.setBounds(441, 116, 151, 23);
		ManchesterCity.add(lblNewLabel_13);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(SystemColor.activeCaption);
		panel_12.setBounds(20, 84, 257, 572);
		ManchesterCity.add(panel_12);
		
		JButton btnNewButton_216 = new JButton("Aguero");
		btnNewButton_216.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_216.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aguero.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		panel_12.setLayout(new GridLayout(0, 2, 0, 0));
		panel_12.add(btnNewButton_216);
		
		JButton btnNewButton_217 = new JButton("Claudio Bravo");
		btnNewButton_217.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_217.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				claudiobravo.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		panel_12.add(btnNewButton_217);
		
		JButton btnNewButton_218 = new JButton("Danilo");
		btnNewButton_218.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_218.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				danilo.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		
		JButton btnNewButton_225 = new JButton("Toure");
		btnNewButton_225.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_225.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toure.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		panel_12.add(btnNewButton_225);
		panel_12.add(btnNewButton_218);
		
		JButton btnNewButton_226 = new JButton("Walker");
		btnNewButton_226.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_226.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				walker.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		
		JButton btnNewButton_219 = new JButton("Fernandinho");
		btnNewButton_219.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_219.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fernandinho.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		panel_12.add(btnNewButton_219);
		panel_12.add(btnNewButton_226);
		
		JButton btnNewButton_224 = new JButton("Sterling");
		btnNewButton_224.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_224.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sterling.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		
		JButton btnNewButton_220 = new JButton("Jesus");
		btnNewButton_220.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_220.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jesus.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		panel_12.add(btnNewButton_220);
		panel_12.add(btnNewButton_224);
		
		JButton btnNewButton_221 = new JButton("Kompany");
		btnNewButton_221.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_221.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kompany.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		panel_12.add(btnNewButton_221);
		
		JButton btnNewButton_222 = new JButton("Otamendi");
		btnNewButton_222.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_222.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otamendi.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		panel_12.add(btnNewButton_222);
		
		JButton btnNewButton_223 = new JButton("Silva");
		btnNewButton_223.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_223.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				silva.setVisible(true);
				ManchesterCity.setVisible(false);
			}
		});
		panel_12.add(btnNewButton_223);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(34, 139, 34));
		panel_19.setBounds(690, 84, 335, 551);
		ManchesterCity.add(panel_19);
		panel_19.setLayout(null);
		
		JLabel lblNewLabel_42 = new JLabel();
		lblNewLabel_42.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/BPL trophy.jpg")));
		lblNewLabel_42.setBounds(104, 11,120,100);
		panel_19.add(lblNewLabel_42);
		
		JLabel lblNewLabel_43 = new JLabel();
		lblNewLabel_43.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/FA-CUP.jpg")));
		lblNewLabel_43.setBounds(104, 190,120,100);
		panel_19.add(lblNewLabel_43);
		
		JLabel lblNewLabel_44 = new JLabel();
		lblNewLabel_44.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UEFA cup winers.jpg")));
		lblNewLabel_44.setBounds(104, 378, 120,100);
		panel_19.add(lblNewLabel_44);
		
		JLabel lb_517 = new JLabel("Barclays Premier League-2 times");
		lb_517.setFont(f1);
		lb_517.setBounds(65, 114, 219, 40);
		panel_19.add(lb_517);

		JLabel lb_518 = new JLabel("FA cup-5 time");
		lb_518.setFont(f1);
		lb_518.setBounds(114, 301, 160, 40);
		panel_19.add(lb_518);

		JLabel lb_519 = new JLabel("UEFA cup-1 time");
		lb_519.setFont(f1);
		lb_519.setBounds(114, 477, 160, 40);
		panel_19.add(lb_519);

		 ManchesterUtd = new JPanel();
		 ManchesterUtd.setBackground(new Color(204, 51, 0));
		frame.getContentPane().add(ManchesterUtd, "name_693051592902985");
		ManchesterUtd.setLayout(null);
		
		JButton btnNewButton_3 = new JButton();
		btnNewButton_3.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManchesterUtd.setVisible(false);
				BPL1.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(0, 0, 30,30);
		ManchesterUtd.add(btnNewButton_3);
		
		JButton btnNewButton_227 = new JButton();
		btnNewButton_227.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/Jose Mourinho.jpg")));
		btnNewButton_227.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JoseMourinho.setVisible(true);
				ManchesterUtd.setVisible(false);
			}
		});
		btnNewButton_227.setBounds(600, 11, 130, 98);
		ManchesterUtd.add(btnNewButton_227);
		
		JLabel lblNewLabel_14 = new JLabel("José Mourinho");
		lblNewLabel_14.setFont(f);
		lblNewLabel_14.setBounds(591, 132, 150, 23);
		ManchesterUtd.add(lblNewLabel_14);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(25, 25, 112));
		panel_13.setBounds(39, 34, 401,764);
		ManchesterUtd.add(panel_13);
		panel_13.setLayout(null);
		
		JButton btnNewButton_228 = new JButton();
		btnNewButton_228.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_228.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Alexis Sanchez.jpg")));
		btnNewButton_228.setBounds(270, 573,120,100);
		panel_13.add(btnNewButton_228);
		
		JButton btnNewButton_229 = new JButton();
		btnNewButton_229.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Ashley Young.jpg")));
		btnNewButton_229.setBounds(28, 106, 120,100);
		panel_13.add(btnNewButton_229);
		
		JButton btnNewButton_230 = new JButton();
		btnNewButton_230.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				degea.setVisible(true);
				ManchesterUtd.setVisible(false);
			}
		});
		btnNewButton_230.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/De gea.jpg")));
		btnNewButton_230.setBounds(152, 0,120,100);
		panel_13.add(btnNewButton_230);
		
		JButton btnNewButton_231 = new JButton();
		btnNewButton_231.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_231.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Lukaku.png")));
		btnNewButton_231.setBounds(28, 442, 120,100);
		panel_13.add(btnNewButton_231);
		
		JButton btnNewButton_232 = new JButton();
		btnNewButton_232.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Marouane-Fellaini.jpg")));
		btnNewButton_232.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_232.setBounds(152, 217, 120,100);
		panel_13.add(btnNewButton_232);
		
		JButton btnNewButton_233 = new JButton();
		btnNewButton_233.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Phil Jones.jpg")));
		btnNewButton_233.setBounds(28, 319,120,100);
		panel_13.add(btnNewButton_233);
		
		JButton btnNewButton_234 = new JButton();
		btnNewButton_234.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Pogba.jpg")));
		btnNewButton_234.setBounds(270, 442,120,100);
		panel_13.add(btnNewButton_234);
		
		JButton btnNewButton_235 = new JButton();
		btnNewButton_235.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Michael Carrick.jpg")));
		btnNewButton_235.setBounds(28, 573,120,100);
		panel_13.add(btnNewButton_235);
		
		JButton btnNewButton_236 = new JButton();
		btnNewButton_236.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_236.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Juan Mata.jpg")));
		btnNewButton_236.setBounds(152, 442, 120,100);
		panel_13.add(btnNewButton_236);
		
		JButton btnNewButton_237 = new JButton();
		btnNewButton_237.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_237.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Eric Bailly.jpg")));
		btnNewButton_237.setBounds(270, 106, 120,100);
		panel_13.add(btnNewButton_237);
		
		JButton btnNewButton_238 = new JButton();
		btnNewButton_238.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Luke Shaw.jpg")));
		btnNewButton_238.setBounds(270, 319,120,100);
		panel_13.add(btnNewButton_238);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(UIManager.getColor("Button.disabledForeground"));
		panel_20.setBounds(488, 188, 678, 393);
		ManchesterUtd.add(panel_20);
		panel_20.setLayout(null);
		
		JLabel lb_511 = new JLabel("Barclays Premier League 13 times");
		lb_511.setFont(f1);
		lb_511.setBounds(10, 122, 210, 40);
		panel_20.add(lb_511);

		JLabel lb_512 = new JLabel("Europa League 1 time");
		lb_512.setFont(f1);
		lb_512.setBounds(36, 332, 160, 40);
		panel_20.add(lb_512);

		JLabel lb_513 = new JLabel("FA-cup-12 times");
		lb_513.setFont(f1);
		lb_513.setBounds(284, 122, 160, 40);
		panel_20.add(lb_513);

		JLabel lb_514 = new JLabel("Fifa club world cup 1 time");
		lb_514.setFont(f1);
		lb_514.setBounds(258, 332, 160, 40);
		panel_20.add(lb_514);

		JLabel lb_515 = new JLabel("UCL cup- 5 times");
		lb_515.setFont(f1);
		lb_515.setBounds(531, 122, 160, 40);
		panel_20.add(lb_515);
		
		JLabel lblNewLabel_45 = new JLabel();
		lblNewLabel_45.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/BPL trophy.jpg")));
		lblNewLabel_45.setBounds(43, 11,120,100);
		panel_20.add(lblNewLabel_45);
		
		JLabel lblNewLabel_46 = new JLabel();
		lblNewLabel_46.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/FA-CUP.jpg")));
		lblNewLabel_46.setBounds(274, 11, 120,100);
		panel_20.add(lblNewLabel_46);
		
		JLabel lblNewLabel_47 = new JLabel();
		lblNewLabel_47.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UCL.jpg")));
		lblNewLabel_47.setBounds(521, 11, 120,100);
		panel_20.add(lblNewLabel_47);
		
		JLabel lblNewLabel_49 = new JLabel();
		lblNewLabel_49.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/europa league.jpg")));
		lblNewLabel_49.setBounds(43, 221,120,100);
		panel_20.add(lblNewLabel_49);
		
		JLabel lblNewLabel_50 = new JLabel();
		lblNewLabel_50.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/fifa_club_world_cup.jpg")));
		lblNewLabel_50.setBounds(274, 221, 120,100);
		panel_20.add(lblNewLabel_50);
		
		 Tottenham = new JPanel();
		 Tottenham.setBackground(new Color(186, 85, 211));
		frame.getContentPane().add(Tottenham, "name_693055839974126");
		Tottenham.setLayout(null);
		
		JButton btnNewButton_4 = new JButton();
		btnNewButton_4.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tottenham.setVisible(false);
				BPL1.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(0, 0, 30,30);
		Tottenham.add(btnNewButton_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(20, 120, 427, 370);
		Tottenham.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_63 = new JButton("Hugo Loris");
		btnNewButton_63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hugo.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_63.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_63.setBackground(Color.white);
		btnNewButton_63.setBounds(0, 0, 140,45);
		panel_3.add(btnNewButton_63);
		
		JButton btnNewButton_64 = new JButton("Daniel Lee Rose");
		btnNewButton_64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				daniel.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_64.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_64.setBounds(149, 53,  140,45);
		panel_3.add(btnNewButton_64);
		
		JButton btnNewButton_65 = new JButton("Victor Wanyama");
		btnNewButton_65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				victor.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_65.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_65.setBounds(69, 221,  140,45);
		panel_3.add(btnNewButton_65);
		
		JButton btnNewButton_66 = new JButton("Toby Alderweireld");
		btnNewButton_66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tobias.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_66.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_66.setBounds(245, 109, 172,45);
		panel_3.add(btnNewButton_66);
		
		JButton btnNewButton_67 = new JButton("Eric Dier");
		btnNewButton_67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eric.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_67.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_67.setBounds(289, 0, 128,45);
		panel_3.add(btnNewButton_67);
		
		JButton btnNewButton_68 = new JButton("Juan Foyth");
		btnNewButton_68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				juan.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_68.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_68.setBounds(10, 294,  140,45);
		panel_3.add(btnNewButton_68);
		
		JButton btnNewButton_69 = new JButton("Lucas");
		btnNewButton_69.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lucas.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_69.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_69.setBounds(10, 165, 140,45);
		panel_3.add(btnNewButton_69);
		
		JButton btnNewButton_70 = new JButton("Kazaiah Sterling");
		btnNewButton_70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kazaia.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_70.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_70.setBounds(214, 165,  140,45);
		panel_3.add(btnNewButton_70);
		
		JButton btnNewButton_71 = new JButton("Llorente");
		btnNewButton_71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				liorente.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_71.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_71.setBounds(267, 221,  140,45);
		panel_3.add(btnNewButton_71);
		
		JButton btnNewButton_72 = new JButton("Harry Kane");
		btnNewButton_72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				harry.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_72.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_72.setBounds(267, 294,  140,45);
		panel_3.add(btnNewButton_72);
		
		JButton btnNewButton_73 = new JButton("Serge Aurier");
		btnNewButton_73.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				serge.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_73.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_73.setBounds(27, 109, 140,45);
		panel_3.add(btnNewButton_73);
		
		JLabel lblNewLabel_11 = new JLabel();
		lblNewLabel_11.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Tottenham Squad.jpg")));
		lblNewLabel_11.setBounds(0, 0, 427, 350);
		panel_3.add(lblNewLabel_11);
		
		JButton btnNewButton_277 = new JButton();
		btnNewButton_277.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/Mauricio Pochettino.jpg")));
		btnNewButton_277.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MauricioPochettino.setVisible(true);
				Tottenham.setVisible(false);
			}
		});
		btnNewButton_277.setBounds(536, 11, 120,100);
		Tottenham.add(btnNewButton_277);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(47, 79, 79));
		panel_22.setBounds(722, 120, 441, 359);
		Tottenham.add(panel_22);
		panel_22.setLayout(null);
		
		JLabel lblNewLabel_52 = new JLabel();
		lblNewLabel_52.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/FA-CUP.jpg")));
		lblNewLabel_52.setBounds(35,194, 120,100);
		panel_22.add(lblNewLabel_52);
		
		JLabel lblNewLabel_53 = new JLabel();
		lblNewLabel_53.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/BPL trophy.jpg")));
		lblNewLabel_53.setBounds(159, 11, 120,100);
		panel_22.add(lblNewLabel_53);
		
		JLabel lblNewLabel_54 = new JLabel();
		lblNewLabel_54.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/europa league.jpg")));
		lblNewLabel_54.setBounds(292,194, 120,100);
		panel_22.add(lblNewLabel_54);
		
		JLabel lblNewLabel_64 = new JLabel("Mauricio Pochettino");
		lblNewLabel_64.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_64.setBounds(536, 120, 155, 38);
		Tottenham.add(lblNewLabel_64);
		
		JLabel lb_524 = new JLabel("Have not achieved");
		lb_524.setFont(f1);
		lb_524.setBounds(159, 122, 160, 40);
		panel_22.add(lb_524);

		JLabel lb_526 = new JLabel("FA-cup 8 times");
		lb_526.setFont(f1);
		lb_526.setBounds(45, 305, 160, 40);
		panel_22.add(lb_526);

		JLabel lb_527 = new JLabel("UEFA cup 1 time");
		lb_527.setFont(f1);
		lb_527.setBounds(302, 305, 160, 40);
		panel_22.add(lb_527);
		
		 Liverpool = new JPanel();
		frame.getContentPane().add(Liverpool, "name_693058318968011");
		
		JButton btnNewButton_5 = new JButton();
		btnNewButton_5.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_5.setBounds(0, 0, 30,30);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Liverpool.setVisible(false);
				BPL1.setVisible(true);
			}
		});
		Liverpool.setLayout(null);
		Liverpool.add(btnNewButton_5);
		
		JButton btnNewButton_284 = new JButton("");
		btnNewButton_284.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/Jurgen klopp.jpeg")));
		btnNewButton_284.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jurgenklopp.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		btnNewButton_284.setBounds(554, 11, 120, 101);
		Liverpool.add(btnNewButton_284);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(255, 215, 0));
		panel_24.setBounds(53, 88, 246, 650);
		Liverpool.add(panel_24);
		panel_24.setLayout(null);
		
		JLabel lblNewLabel_55 = new JLabel();
		lblNewLabel_55.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/BPL trophy.jpg")));
		lblNewLabel_55.setBounds(53, 11, 120,100);
		panel_24.add(lblNewLabel_55);
		
		JLabel lblNewLabel_56 = new JLabel();
		lblNewLabel_56.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/FA-CUP.jpg")));
		lblNewLabel_56.setBounds(53, 164,120,100);
		panel_24.add(lblNewLabel_56);
		
		JLabel lblNewLabel_57 = new JLabel();
		lblNewLabel_57.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UEFA cup winers.jpg")));
		lblNewLabel_57.setBounds(53, 335, 120,100);
		panel_24.add(lblNewLabel_57);
		
		JLabel lblNewLabel_58 = new JLabel();
		lblNewLabel_58.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Europian super cup.jpg")));
		lblNewLabel_58.setBounds(53, 499, 120,100);
		panel_24.add(lblNewLabel_58);
		
		JLabel lb_520 = new JLabel("Have not achieved");
		lb_520.setFont(f1);
		lb_520.setBounds(53, 107, 160, 40);
		panel_24.add(lb_520);

		JLabel lb_521 = new JLabel("FA-cup-7 times");
		lb_521.setFont(f1);
		lb_521.setBounds(63, 262, 160, 40);
		panel_24.add(lb_521);

		JLabel lb_522 = new JLabel("UCL cup 3 times");
		lb_522.setFont(f1);
		lb_522.setBounds(63, 430, 160, 40);
		panel_24.add(lb_522);

		JLabel lb_523 = new JLabel("UEFA super cup 3 times");
		lb_523.setFont(f1);
		lb_523.setBounds(53, 599, 160, 40);
		panel_24.add(lb_523);
		
		JLabel lblNewLabel_51 = new JLabel("Jurgen klopp");
		lblNewLabel_51.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_51.setBounds(564, 117, 131, 35);
		Liverpool.add(lblNewLabel_51);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(356, 176, 761, 562);
		Liverpool.add(panel_21);
		panel_21.setLayout(null);
		
		JLabel lblNewLabel_65 = new JLabel();
		lblNewLabel_65.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_65.setBackground(Color.RED);
		lblNewLabel_65.setBounds(96, 324, 50,50);
		panel_21.add(lblNewLabel_65);
		
		JLabel lblNewLabel_66 = new JLabel();
		lblNewLabel_66.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_66.setBounds(120, 211, 50,50);
		panel_21.add(lblNewLabel_66);
		
		JLabel lblNewLabel_67 = new JLabel();
		lblNewLabel_67.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_67.setBackground(Color.RED);
		lblNewLabel_67.setBounds(615, 11, 50,50);
		panel_21.add(lblNewLabel_67);
		
		JLabel lblNewLabel_68 = new JLabel();
		lblNewLabel_68.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_68.setBounds(651, 211, 50,50);
		panel_21.add(lblNewLabel_68);
		
		JLabel lblNewLabel_69 = new JLabel();
		lblNewLabel_69.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_69.setBounds(279, 324, 50,50);
		panel_21.add(lblNewLabel_69);
		
		JLabel lblNewLabel_70 = new JLabel();
		lblNewLabel_70.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_70.setBounds(382, 123, 50,50);
		panel_21.add(lblNewLabel_70);
		
		JLabel lblNewLabel_71 = new JLabel();
		lblNewLabel_71.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_71.setBounds(364, 11, 50,50);
		panel_21.add(lblNewLabel_71);
		
		JLabel lblNewLabel_72 = new JLabel();
		lblNewLabel_72.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_72.setBounds(478, 324, 50,50);
		panel_21.add(lblNewLabel_72);
		
		JLabel lblNewLabel_73 = new JLabel();
		lblNewLabel_73.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_73.setBounds(382, 444, 50,50);
		panel_21.add(lblNewLabel_73);
		
		JLabel lblNewLabel_74 = new JLabel();
		lblNewLabel_74.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_74.setBounds(667, 324, 50,50);
		panel_21.add(lblNewLabel_74);
		
		JLabel lblNewLabel_75 = new JLabel();
		lblNewLabel_75.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/red1.jpg")));
		lblNewLabel_75.setBounds(85, 11, 50,50);
		panel_21.add(lblNewLabel_75);
		
		JButton lblNewLabel_76 = new JButton("Karius");
		lblNewLabel_76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				karius.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_76.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_76.setBounds(358, 505, 100,30);
		panel_21.add(lblNewLabel_76);
		
		JButton lblNewLabel_77 = new JButton("Alberto Moreno");
		lblNewLabel_77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Albertomoreno.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_77.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_77.setBounds(46, 393, 162,30);
		panel_21.add(lblNewLabel_77);
		
		JButton lblNewLabel_78 = new JButton("Andrew Robertson");
		lblNewLabel_78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Andrewrobertson.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_78.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_78.setBounds(234, 393, 169,30);
		panel_21.add(lblNewLabel_78);
		
		JButton lblNewLabel_79 = new JButton("Danny Ings");
		lblNewLabel_79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dannyings.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_79.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_79.setBounds(47, 72, 133,30);
		panel_21.add(lblNewLabel_79);
		
		JButton lblNewLabel_80 = new JButton("Georginio Wijnaldum");
		lblNewLabel_80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Georginio.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_80.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_80.setBounds(589, 272, 162,30);
		panel_21.add(lblNewLabel_80);
		
		JButton lblNewLabel_81 = new JButton("James Milner");
		lblNewLabel_81.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Jamesmilner.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_81.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_81.setBounds(63, 272, 169,30);
		panel_21.add(lblNewLabel_81);
		
		JButton lblNewLabel_82 = new JButton("Joe Gomez");
		lblNewLabel_82.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Joegomez.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_82.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_82.setBounds(651, 393, 100,30);
		panel_21.add(lblNewLabel_82);
		
		JButton lblNewLabel_83 = new JButton("Jordan Henderson");
		lblNewLabel_83.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jordanhenderson.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_83.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_83.setBounds(343, 185, 147,30);
		panel_21.add(lblNewLabel_83);
		
		JButton lblNewLabel_84 = new JButton("Mohamed Salah");
		lblNewLabel_84.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salah.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_84.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_84.setBounds(570, 72, 147,30);
		panel_21.add(lblNewLabel_84);
		
		JButton lblNewLabel_85 = new JButton("Ragnar Klavan");
		lblNewLabel_85.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ragnarklaven.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_85.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_85.setBounds(458, 393, 133,30);
		panel_21.add(lblNewLabel_85);
		
		JButton lblNewLabel_86 = new JButton("Roberto Firmino");
		lblNewLabel_86.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Robertofirmino.setVisible(true);
				Liverpool.setVisible(false);
			}
		});
		lblNewLabel_86.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_86.setBounds(307, 72, 169,30);
		panel_21.add(lblNewLabel_86);
		
		JLabel lblNewLabel_162 = new JLabel();
		lblNewLabel_162.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/liv1.jpg")));
		lblNewLabel_162.setBounds(0, 0, 761,562);
		panel_21.add(lblNewLabel_162);
		
		JLabel lblNewLabel_163 = new JLabel();
		lblNewLabel_163.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/liv2.jpg")));
		lblNewLabel_163.setBounds(0, 4,1500,900);
		Liverpool.add(lblNewLabel_163);
		
		 Chelsea = new JPanel();
		 Chelsea.setBackground(new Color(0, 0, 139));
		frame.getContentPane().add(Chelsea, "name_693060604400818");
		Chelsea.setLayout(null);
		
		JButton btnNewButton_6 = new JButton();
		btnNewButton_6.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chelsea.setVisible(false);
				BPL1.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(0, 0,30,30);
		Chelsea.add(btnNewButton_6);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 0, 51));
		panel_11.setBounds(42, 218, 308, 403);
		Chelsea.add(panel_11);
		panel_11.setLayout(null);
		
		JButton btnNewButton_163 = new JButton("Ces Fabrigas");
		btnNewButton_163.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_163.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cescfabregas.setVisible(true);
				Chelsea.setVisible(false);
				
			}
		});
		btnNewButton_163.setBounds(106, 0, 127,50);
		panel_11.add(btnNewButton_163);
		
		JButton btnNewButton_164 = new JButton("David luiz");
		btnNewButton_164.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_164.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Davidluiz.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_164.setBounds(10, 58, 100,50);
		panel_11.add(btnNewButton_164);
		
		JButton btnNewButton_165 = new JButton("Giroud");
		btnNewButton_165.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_165.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giroud.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_165.setBounds(198, 58, 100,50);
		panel_11.add(btnNewButton_165);
		
		JButton btnNewButton_166 = new JButton("Eden Hazard");
		btnNewButton_166.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_166.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edenhazard.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_166.setBounds(10, 129, 135,50);
		panel_11.add(btnNewButton_166);
		
		JButton btnNewButton_167 = new JButton("Marcos Alonso");
		btnNewButton_167.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_167.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marcosalonso.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_167.setBounds(171, 129, 127,50);
		panel_11.add(btnNewButton_167);
		
		JButton btnNewButton_168 = new JButton("Morata");
		btnNewButton_168.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_168.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				morata.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_168.setBounds(10, 190, 100,50);
		panel_11.add(btnNewButton_168);
		
		JButton btnNewButton_169 = new JButton("Kante");
		btnNewButton_169.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_169.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kante.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_169.setBounds(198, 190,100,50);
		panel_11.add(btnNewButton_169);
		
		JButton btnNewButton_170 = new JButton("Thibaut Courtois");
		btnNewButton_170.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_170.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thibautcourtois.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_170.setBounds(10, 261, 135,50);
		panel_11.add(btnNewButton_170);
		
		JButton btnNewButton_171 = new JButton("Tiemoue");
		btnNewButton_171.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_171.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiemoue.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_171.setBounds(198, 261,100,50);
		panel_11.add(btnNewButton_171);
		
		JButton btnNewButton_172 = new JButton("Willian");
		btnNewButton_172.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_172.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				willian.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_172.setBounds(10, 321, 100,50);
		panel_11.add(btnNewButton_172);
		
		JButton btnNewButton_173 = new JButton("Gary Cahill");
		btnNewButton_173.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_173.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_173.setBounds(198, 321, 100,50);
		panel_11.add(btnNewButton_173);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(102, 102, 0));
		panel_23.setBounds(460, 218, 568, 403);
		Chelsea.add(panel_23);
		panel_23.setLayout(null);
		
		JLabel lbl_51 = new JLabel();
		lbl_51.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/BPL trophy.jpg")));
		lbl_51.setBounds(391, 11, 120,100);
		panel_23.add(lbl_51);
		
		JLabel lbl_52 = new JLabel();
		lbl_52.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UCL.jpg")));
		lbl_52.setBounds(63,232, 120,100);
		panel_23.add(lbl_52);
		
		JLabel lbl_53 = new JLabel();
		lbl_53.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/UEFA cup winers.jpg")));
		lbl_53.setBounds(391, 232, 120,100);
		panel_23.add(lbl_53);
		
		JLabel lbl_54 = new JLabel();
		lbl_54.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/FA-CUP.jpg")));
		lbl_54.setBounds(53,11, 120,100);
		panel_23.add(lbl_54);	
		
		JLabel lb_528 = new JLabel("Barclays Premier League-5 times");
		lb_528.setFont(f1);
		lb_528.setBounds(351, 122, 207, 40);
		panel_23.add(lb_528);

		JLabel lb_530 = new JLabel("FA-cup-7 times");
		lb_530.setFont(f1);
		lb_530.setBounds(63, 122, 160, 40);
		panel_23.add(lb_530);

		JLabel lb_531 = new JLabel("UCL cup-1 time");
		lb_531.setFont(f1);
		lb_531.setBounds(73, 338, 160, 40);
		panel_23.add(lb_531);

		JLabel lb_532 = new JLabel("UEFA cup-1 time");
		lb_532.setFont(f1);
		lb_532.setBounds(401, 338, 160, 40);
		panel_23.add(lb_532);
		
		JButton btnNewButton_285 = new JButton();
		btnNewButton_285.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/antonio conte.jpg")));
		btnNewButton_285.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AntonioConte.setVisible(true);
				Chelsea.setVisible(false);
			}
		});
		btnNewButton_285.setBounds(448, 11, 120, 103);
		Chelsea.add(btnNewButton_285);
		
		JLabel lblNewLabel_48 = new JLabel("Antonio Conte");
		lblNewLabel_48.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_48.setBounds(458, 125, 120, 23);
		Chelsea.add(lblNewLabel_48);
		
		 Arsenal = new JPanel();
		frame.getContentPane().add(Arsenal, "name_693063481676342");
		Arsenal.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arsenal.setVisible(false);
				BPL1.setVisible(true);
			}
			
		});
		btnNewButton_7.setBounds(0, 0, 89, 23);
		Arsenal.add(btnNewButton_7);
		
		Burnley = new JPanel();
		frame.getContentPane().add(Burnley, "name_693066023693693");
		Burnley.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Burnley.setVisible(false);
				BPL1.setVisible(true);
			}
			
		});
		btnNewButton_8.setBounds(0, 0, 89, 23);
		Burnley.add(btnNewButton_8);
		
		 LeicesterCity = new JPanel();
		frame.getContentPane().add(LeicesterCity, "name_693068704083975");
		LeicesterCity.setLayout(null);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BPL.setVisible(true);
				LeicesterCity.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(0, 0, 30,30);
		LeicesterCity.add(btnNewButton_1);
		
		 Everton = new JPanel();
		frame.getContentPane().add(Everton, "name_693070902573060");
		Everton.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_9.setBackground(Color.BLACK);
		btnNewButton_9.setBounds(0, 0, 30, 30);
		Everton.add(btnNewButton_9);
		
		 Bournemouth = new JPanel();
		frame.getContentPane().add(Bournemouth, "name_693072575268395");
		Bournemouth.setLayout(null);
		
		JButton btnNewButton_10 = new JButton();
		btnNewButton_10.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bournemouth.setVisible(false);
				BPL1.setVisible(true);
			}
		});
		btnNewButton_10.setBounds(0, 0, 30,30);
		Bournemouth.add(btnNewButton_10);
		
		JButton btnNewButton_52 = new JButton("Nathan Ake");
		btnNewButton_52.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_52.setBounds(28, 65, 130, 23);
		Bournemouth.add(btnNewButton_52);
		
		JButton btnNewButton_53 = new JButton("Arthue Boruc");
		btnNewButton_53.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_53.setBounds(28, 99, 130, 23);
		Bournemouth.add(btnNewButton_53);
		
		JButton btnNewButton_54 = new JButton("Andrew Surman");
		btnNewButton_54.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_54.setBounds(21, 133, 148, 23);
		Bournemouth.add(btnNewButton_54);
		
		JButton btnNewButton_55 = new JButton("Callum");
		btnNewButton_55.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_55.setBounds(45, 167, 89, 23);
		Bournemouth.add(btnNewButton_55);
		
		JButton btnNewButton_56 = new JButton("Cook");
		btnNewButton_56.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_56.setBounds(45, 201, 89, 23);
		Bournemouth.add(btnNewButton_56);
		
		JButton btnNewButton_57 = new JButton("Dan");
		btnNewButton_57.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_57.setBounds(45, 235, 89, 23);
		Bournemouth.add(btnNewButton_57);
		
		JButton btnNewButton_58 = new JButton("Harry");
		btnNewButton_58.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_58.setBounds(45, 269, 89, 23);
		Bournemouth.add(btnNewButton_58);
		
		JButton btnNewButton_59 = new JButton("Jermain");
		btnNewButton_59.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_59.setBounds(45, 303, 89, 23);
		Bournemouth.add(btnNewButton_59);
		
		JButton btnNewButton_60 = new JButton("Junior");
		btnNewButton_60.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_60.setBounds(45, 337, 89, 23);
		Bournemouth.add(btnNewButton_60);
		
		JButton btnNewButton_61 = new JButton("Marc");
		btnNewButton_61.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_61.setBounds(45, 371, 89, 23);
		Bournemouth.add(btnNewButton_61);
		
		JButton btnNewButton_62 = new JButton("Simon");
		btnNewButton_62.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_62.setBounds(45, 409, 89, 23);
		Bournemouth.add(btnNewButton_62);
		
		JLabel lblNewLabel_10 = new JLabel();
		lblNewLabel_10.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/download.jpg")));
	    
		lblNewLabel_10.setBounds(10, 34, 174, 414);
		Bournemouth.add(lblNewLabel_10);
		
		 Cescfabregas = new JPanel();
		 Cescfabregas.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(Cescfabregas, "name_870124894911820");
		Cescfabregas.setLayout(null);
		
		JButton btnNewButton_174 = new JButton();
		btnNewButton_174.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_174.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cescfabregas.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_174.setBounds(0, 0, 30,30);
		Cescfabregas.add(btnNewButton_174);
		
		JList list_3 = new JList(name1);
		list_3.setBounds(70, 71, 337,115);
		Cescfabregas.add(list_3);
		
		 Davidluiz = new JPanel();
		 Davidluiz.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(Davidluiz, "name_870141205548724");
		Davidluiz.setLayout(null);
		
		JButton btnNewButton_175 = new JButton();
		btnNewButton_175.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_175.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Davidluiz.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_175.setBounds(0, 0, 30,30);
		Davidluiz.add(btnNewButton_175);
		
		JList list_4 = new JList(name2);
		list_4.setBounds(83, 60,373, 114);
		Davidluiz.add(list_4);
		
		 Edenhazard = new JPanel();
		 Edenhazard.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(Edenhazard, "name_870148030324958");
		Edenhazard.setLayout(null);
		
		JButton btnNewButton_176 = new JButton();
		btnNewButton_176.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_176.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edenhazard.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_176.setBounds(0, 0, 30,30);
		Edenhazard.add(btnNewButton_176);
		
		JList list_5 = new JList(name3);
		list_5.setBounds(66, 62, 350, 114);
		Edenhazard.add(list_5);
		
		 giroud = new JPanel();
		 giroud.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(giroud, "name_870156812665280");
		giroud.setLayout(null);
		
		JButton btnNewButton_178 = new JButton();
		btnNewButton_178.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_176.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giroud.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_178.setBounds(0, 0, 30,30);
		giroud.add(btnNewButton_178);
		
		 Marcosalonso = new JPanel();
		 Marcosalonso.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(Marcosalonso, "name_870160174617898");
		Marcosalonso.setLayout(null);
		
		JButton btnNewButton_179 = new JButton();
		btnNewButton_179.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_179.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marcosalonso.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_179.setBounds(0, 0,30,30);
		Marcosalonso.add(btnNewButton_179);
		
		JList list_7 = new JList(name4);
		list_7.setBounds(73, 74,350, 114);
		Marcosalonso.add(list_7);
		
		 morata = new JPanel();
		 morata.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(morata, "name_870162869690230");
		morata.setLayout(null);
		
		JButton btnNewButton_177 = new JButton();
		btnNewButton_177.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_177.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				morata.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_177.setBounds(0, 0,30,30);
		morata.add(btnNewButton_177);
		
		JList list_6 = new JList(name5);
		list_6.setBounds(66, 64,350, 114);
		morata.add(list_6);
		
		 kante = new JPanel();
		 kante.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(kante, "name_870166181236362");
		kante.setLayout(null);
		
		JButton btnNewButton_180 = new JButton();
		btnNewButton_180.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_180.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kante.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_180.setBounds(0, 0, 30,30);
		kante.add(btnNewButton_180);
		
		JList list_8 = new JList(name6);
		list_8.setBounds(62, 67,397,113);
		kante.add(list_8);
		
		 Thibautcourtois = new JPanel();
		 Thibautcourtois.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(Thibautcourtois, "name_870169069195638");
		Thibautcourtois.setLayout(null);
		
		JList list_9 = new JList(name7);
		list_9.setBounds(71, 92,350, 114);
		Thibautcourtois.add(list_9);
		
		JButton btnNewButton_181 = new JButton();
		btnNewButton_181.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_181.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thibautcourtois.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_181.setBounds(0, 0, 30,30);
		Thibautcourtois.add(btnNewButton_181);
		
		tiemoue=new JPanel();
		tiemoue.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(tiemoue, "name_870171885371111");
		tiemoue.setLayout(null);
		
		JButton btnNewButton_182 = new JButton();
	   btnNewButton_182.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));;
		btnNewButton_182.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiemoue.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_182.setBounds(0, 0,30,30);
		tiemoue.add(btnNewButton_182);
		
		JList list_10 = new JList(name8);
		list_10.setBounds(72, 72, 350, 114);
		tiemoue.add(list_10);
		
		 willian = new JPanel();
		 willian.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(willian, "name_870174453184346");
		willian.setLayout(null);
		
		JButton btnNewButton_183 = new JButton();
		btnNewButton_183.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_183.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				willian.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_183.setBounds(0, 0, 30,30);
		willian.add(btnNewButton_183);
		
		JList list_11 = new JList(name9);
		list_11.setBounds(53, 58, 350, 114);
		willian.add(list_11);
		
	    cahil = new JPanel();
	    cahil.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(cahil, "name_870177261101672");
		cahil.setLayout(null);
		
		JButton btnNewButton_193 = new JButton();
		btnNewButton_193.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_193.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cahil.setVisible(false);
				Chelsea.setVisible(true);
			}
		});
		btnNewButton_193.setBounds(0, 0, 30,30);
		cahil.add(btnNewButton_193);
		
		JList list_86 = new JList(name11);
		list_86.setBounds(95, 53, 350, 114);
		cahil.add(list_86);
		
		daniel = new JPanel();
		daniel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(daniel, "name_877724924021203");
		daniel.setLayout(null);
		
		JButton button_1 = new JButton();
		button_1.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				daniel.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		button_1.setBounds(0, 0, 30,30);
		daniel.add(button_1);
		
		JList list_23 = new JList(t1);
		list_23.setBounds(70, 53, 290,96);
		daniel.add(list_23);
		
		hugo = new JPanel();
		hugo.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(hugo, "name_877730555165534");
		hugo.setLayout(null);
		
		JButton btnNewButton_194 = new JButton();
		btnNewButton_194.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_194.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hugo.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_194.setBounds(0, 0,30,30);
		hugo.add(btnNewButton_194);
		
		JList list_24 = new JList(t2);
		list_24.setFont(f1);
		list_24.setBounds(60, 54, 400,115);
		hugo.add(list_24);
		
		 eric = new JPanel();
		 eric.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(eric, "name_877733762309994");
		eric.setLayout(null);
		
		JButton btnNewButton_195 = new JButton();
		btnNewButton_195.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_195.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eric.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_195.setBounds(0, 0, 30,30);
		eric.add(btnNewButton_195);
		
		JList list_25 = new JList(t3);
		list_25.setBounds(48, 56, 400, 115);
		eric.add(list_25);
		
		 harry = new JPanel();
		 harry.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(harry, "name_877743665471855");
		harry.setLayout(null);
		
		JButton btnNewButton_196 = new JButton();
		btnNewButton_196.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_196.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				harry.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_196.setBounds(0, 0, 30,30);
		harry.add(btnNewButton_196);
		
		JList list_26 = new JList(t4);
		list_26.setBounds(49, 50, 400,115);
		harry.add(list_26);
		
	    juan = new JPanel();
	    juan.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(juan, "name_877746641775175");
		juan.setLayout(null);
		
		JButton btnNewButton_197 = new JButton("New button");
		btnNewButton_197.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				juan.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_197.setBounds(10, 0, 89, 23);
		juan.add(btnNewButton_197);
		
		JList list_27 = new JList(t5);
		list_27.setBounds(63, 52, 400,115);
		juan.add(list_27);
		
		 kazaia = new JPanel();
		 kazaia.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(kazaia, "name_877749737409258");
		kazaia.setLayout(null);
		
		JButton btnNewButton_198 = new JButton();
		btnNewButton_198.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_198.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    kazaia.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_198.setBounds(0, 0,30,30);
		kazaia.add(btnNewButton_198);
		
		JList list_28 = new JList(t6);
		list_28.setBounds(52, 53,  400,115);
		kazaia.add(list_28);
		
		 liorente = new JPanel();
		 liorente.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(liorente, "name_877753009065828");
		liorente.setLayout(null);
		
		JButton btnNewButton_199 = new JButton();
		btnNewButton_199.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_199.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liorente.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_199.setBounds(0, 0, 30,30);
		liorente.add(btnNewButton_199);
		
		JList list_29 = new JList(t7);
		list_29.setBounds(51, 60, 400,115);
		liorente.add(list_29);
		
		lucas = new JPanel();
		lucas.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(lucas, "name_877755770096247");
		lucas.setLayout(null);
		
		JButton btnNewButton_200 = new JButton();
		btnNewButton_200.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    lucas.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_200.setBounds(0, 0, 30,30);
		lucas.add(btnNewButton_200);
		
		JList list_30 = new JList(t8);
		list_30.setBounds(70, 53, 342,118);
		lucas.add(list_30);
		
		serge = new JPanel();
		serge.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(serge, "name_877758650879404");
		serge.setLayout(null);
		
		JButton btnNewButton_201 = new JButton();
		btnNewButton_201.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_201.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				serge.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_201.setBounds(0, 0, 30,30);
		serge.add(btnNewButton_201);
		
		JList list_31 = new JList(t9);
		list_31.setBounds(45, 50, 400,115);
		serge.add(list_31);
		
		tobias = new JPanel();
		tobias.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(tobias, "name_877762274398335");
		tobias.setLayout(null);
		
		JButton btnNewButton_202 = new JButton();
		btnNewButton_202.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_202.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tobias.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_202.setBounds(0, 0, 30,30);
		tobias.add(btnNewButton_202);
		
		JList list_32 = new JList(t10);
		list_32.setBounds(46, 53, 400,115);
		tobias.add(list_32);
		
	    victor1 = new JPanel();
	    victor1.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(victor1, "name_877765674278697");
		victor1.setLayout(null);
		
		JButton btnNewButton_203 = new JButton();
		btnNewButton_203.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_203.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    victor1.setVisible(false);
				Tottenham.setVisible(true);
			}
		});
		btnNewButton_203.setBounds(0, 0, 30,30);
		victor1.add(btnNewButton_203);
		
		JList list_33 = new JList(t11);
		list_33.setBounds(48, 59, 400,115);
		victor1.add(list_33);
		
		aguero = new JPanel();
		aguero.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add( aguero, "name_922536956601952");
		aguero.setLayout(null);
		
		JButton btnNewButton_204 = new JButton();
		btnNewButton_204.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_204.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aguero.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_204.setBounds(0, 0, 30,30);
		aguero.add(btnNewButton_204);

		JList list_34 = new JList(c1);
		list_34.setFont(f);
		list_34.setBounds(36, 57,400,115);
		aguero.add(list_34);
		 
		JLabel lblNewLabel_137 = new JLabel();
		lblNewLabel_137.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/MANC/Aguero.png")));
		lblNewLabel_137.setBounds(569, 11, 485, 386);
		aguero.add(lblNewLabel_137);
		
		claudiobravo = new JPanel();
		claudiobravo.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(claudiobravo, "name_922544161486355");
		claudiobravo.setLayout(null);
		
		JButton btnNewButton_205 = new JButton();
		btnNewButton_205.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_205.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				claudiobravo.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_205.setBounds(0, 0, 30,30);
		claudiobravo.add(btnNewButton_205);
		
		JList list_35 = new JList(c7);
		list_35.setFont(f);
		list_35.setBounds(72, 57, 400,115);
		claudiobravo.add(list_35);
		
		danilo= new JPanel();
		danilo.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(danilo, "name_922549465166020");
		danilo.setLayout(null);
		
		JButton btnNewButton_206 = new JButton();
		btnNewButton_206.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_206.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				danilo.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_206.setBounds(0, 0, 30,30);
		danilo.add(btnNewButton_206);
		
		JList list_36 = new JList(c8);
		list_36.setFont(f);
		list_36.setBounds(57, 44, 400,115);
		danilo.add(list_36);
		
		fernandinho = new JPanel();
		fernandinho.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(fernandinho, "name_922667801720408");
		fernandinho.setLayout(null);
		
		JButton btnNewButton_207 = new JButton();
		btnNewButton_207.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_207.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fernandinho.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_207.setBounds(0, 0, 30,30);
		fernandinho.add(btnNewButton_207);
		
		JList list_37 = new JList(c9);
		list_37.setFont(f);
		list_37.setBounds(67, 47, 400,115);
		fernandinho.add(list_37);
		
		jesus = new JPanel();
		jesus.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(jesus, "name_922672072636283");
		jesus.setLayout(null);
		
		JButton btnNewButton_208 = new JButton();
		btnNewButton_208.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_205.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jesus.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_208.setBounds(0, 0, 30,30);
		jesus.add(btnNewButton_208);
		
		JList list_38 = new JList(c10);
		list_38.setFont(f);
		list_38.setBounds(61, 56, 400,115);
		jesus.add(list_38);
		
		kompany = new JPanel();
		kompany.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(kompany, "name_922675688153494");
		kompany.setLayout(null);
		
		JButton btnNewButton_209 = new JButton();
		btnNewButton_209.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_209.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kompany.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_209.setBounds(0, 0,30,30);
		kompany.add(btnNewButton_209);
		
		JList list_39 = new JList(c11);
		list_39.setFont(f);
		list_39.setBounds(62, 52, 400,115);
		kompany.add(list_39);
		
		otamendi = new JPanel();
		otamendi.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(otamendi, "name_922751835427985");
		otamendi.setLayout(null);
		
		JButton btnNewButton_210 = new JButton();
		btnNewButton_210.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_210.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otamendi.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_210.setBounds(0, 0, 30,30);
		otamendi.add(btnNewButton_210);
		
		JList list_40 = new JList(c2);
		list_40.setFont(f);
		list_40.setBounds(59, 46, 400,115);
		otamendi.add(list_40);
		
		silva = new JPanel();
		silva.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(silva, "name_922756016610588");
		silva.setLayout(null);
		
		JButton btnNewButton_211 = new JButton();
		btnNewButton_211.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_211.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				silva.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_211.setBounds(0, 0,30,30);
		silva.add(btnNewButton_211);
		
		JList list_41 = new JList(c3);
		list_41.setFont(f);
		list_41.setBounds(63, 53, 400,115);
		silva.add(list_41);
		
		sterling = new JPanel();
		sterling.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(sterling, "name_922760490583450");
		sterling.setLayout(null);
		
		JButton btnNewButton_212 = new JButton();
		btnNewButton_212.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_212.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sterling.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_212.setBounds(0, 0,30,30);
		sterling.add(btnNewButton_212);
		
		JList list_42 = new JList(c4);
		list_42.setFont(f);
		list_42.setBounds(66, 51, 400,115);
		sterling.add(list_42);
		
		toure = new JPanel();
		toure.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(toure, "name_922854089252845");
		toure.setLayout(null);
		
		JButton btnNewButton_213 = new JButton();
		btnNewButton_213.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_213.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toure.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_213.setBounds(0, 0, 30,30);
		toure.add(btnNewButton_213);
		
		JList list_43 = new JList(c5);
		list_43.setFont(f);
		list_43.setBounds(66, 51, 400,115);
		toure.add(list_43);
		
	    walker = new JPanel();
	    walker.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(walker, "name_922859120696952");
		walker.setLayout(null);
		
		JButton btnNewButton_214 = new JButton();
		btnNewButton_214.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_214.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				walker.setVisible(false);
				ManchesterCity.setVisible(true);
			}
		});
		btnNewButton_214.setBounds(0, 0, 30,30);
		walker.add(btnNewButton_214);
		
		JList list_44 = new JList(c6);
	    list_44.setFont(f);
		list_44.setBounds(24, 50, 400,115);
		walker.add(list_44);
		
		cristianoronaldo = new JPanel();
		cristianoronaldo.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(cristianoronaldo, "name_933453555924148");
		cristianoronaldo.setLayout(null);
		
		JButton btnNewButton_239 = new JButton();
		btnNewButton_239.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_239.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cristianoronaldo.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_239.setBounds(0, 0, 30,30);
		cristianoronaldo.add(btnNewButton_239);
		
		JList list_55 = new JList(r5);
		list_55.setBackground(SystemColor.inactiveCaption);
		list_55.setFont(new Font("Tahoma", Font.BOLD, 13));
		list_55.setBounds(54, 50, 363,115);
		cristianoronaldo.add(list_55);
		
		JLabel lblNewLabel_114 = new JLabel();
		lblNewLabel_114.setBounds(499, 50, 120, 107);
		cristianoronaldo.add(lblNewLabel_114);
		
		JLabel lblNewLabel_183 = new JLabel("");
		lblNewLabel_183.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/ronaldo3.jpg")));
		lblNewLabel_183.setBounds(884, 11, 387, 360);
		cristianoronaldo.add(lblNewLabel_183);
		
		JLabel lblNewLabel_184 = new JLabel("");
		lblNewLabel_184.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/IM_des/Cristiano-Ronaldo1.jpg")));
		lblNewLabel_184.setBounds(0, 0, 1400, 980);
		cristianoronaldo.add(lblNewLabel_184);
		
		marcelo=new JPanel();
		marcelo.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(marcelo);
		marcelo.setLayout(null);
		
		JButton btnNewButton_240 = new JButton();
		btnNewButton_240.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_240.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marcelo.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_239.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marcelo.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_240.setBounds(0, 0, 30,30);
		marcelo.add(btnNewButton_240);
		
		JList list_54 = new JList(r10);
		list_54.setBounds(47, 34, 438,115);
		marcelo.add(list_54);
		
		navas=new JPanel();
		navas.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(navas);
		navas.setLayout(null);
		
		JButton btnNewButton_241 = new JButton();
		btnNewButton_241.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_241.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				navas.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_239.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navas.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_241.setBounds(0, 0, 30,30);
		navas.add(btnNewButton_241);
		
		JList list_53 = new JList(r9);
		list_53.setBounds(49, 34, 400,115);
		navas.add(list_53);
		
		ramos=new JPanel();
		ramos.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(ramos);
		ramos.setLayout(null);
		
		JButton btnNewButton_242 = new JButton();
		btnNewButton_242.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_242.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramos.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_242.setBounds(0, 0, 30,30);
		ramos.add(btnNewButton_242);
		
		JList list_52 = new JList(r11);
		list_52.setBounds(55, 48, 400,115);
		ramos.add(list_52);
		
		nacho=new JPanel();
		nacho.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(nacho);
		nacho.setLayout(null);
		
		JButton btnNewButton_243 = new JButton();
		btnNewButton_243.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_243.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nacho.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_243.setBounds(0, 0, 30,30);
		nacho.add(btnNewButton_243);
		
		JList list_51 = new JList(r8);
		list_51.setBounds(61, 45, 400,115);
		nacho.add(list_51);
		
		isco=new JPanel();
		isco.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(isco);
		isco.setLayout(null);
		
		JButton btnNewButton_244 = new JButton();
		btnNewButton_244.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_244.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isco.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_244.setBounds(0, 0,30,30);
		isco.add(btnNewButton_244);
		
		JList list_50 = new JList(r2);
		list_50.setBounds(62, 46, 457,115);
		isco.add(list_50);
		
		modrich=new JPanel();
		modrich.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(modrich);
		modrich.setLayout(null);
		
		JButton btnNewButton_245 = new JButton();
		btnNewButton_245.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modrich.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_245.setBounds(0, 0,30,30);
		modrich.add(btnNewButton_245);
		
		JList list_49 = new JList(r4);
		list_49.setFont(f);
		list_49.setBounds(64, 71, 400,115);
		modrich.add(list_49);
		
		bale=new JPanel();
		bale.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(bale);
		bale.setLayout(null);
		
		JButton btnNewButton_246 = new JButton();
		btnNewButton_246.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_246.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bale.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_246.setBounds(0, 0, 30,30);
		bale.add(btnNewButton_246);
		
		JList list_48 = new JList(r7);
		list_48.setBounds(70,53,400,115);
		bale.add(list_48);
		
		benzama=new JPanel();
		benzama.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(benzama);
		benzama.setLayout(null);
		
		JButton btnNewButton_247 = new JButton();
		btnNewButton_247.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_247.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				benzama.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_247.setBounds(0, 0, 30,30);
		benzama.add(btnNewButton_247);
		
		JList list_47 = new JList(r3);
		list_47.setBounds(70,53, 400,115);
		benzama.add(list_47);
		
		carvajal=new JPanel();
		carvajal.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(carvajal);
		carvajal.setLayout(null);	
		
		JButton btnNewButton_248 = new JButton();
		btnNewButton_248.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_248.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carvajal.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_248.setBounds(0, 0, 30,30);
		carvajal.add(btnNewButton_248);
		
		JList list_46 = new JList(r6);
		list_46.setBounds(64, 49, 400,115);
		carvajal.add(list_46);
		
		casemiro=new JPanel();
		casemiro.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(casemiro);
		casemiro.setLayout(null);
		
		JButton btnNewButton_249 = new JButton();
		btnNewButton_249.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_249.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				casemiro.setVisible(false);
				RealMadrid.setVisible(true);
			}
		});
		btnNewButton_249.setBounds(0, 0, 30,30);
		casemiro.add(btnNewButton_249);
		
		JList list_45 = new JList(r1);
		list_45.setBounds(77, 56,400,115);
		casemiro.add(list_45);
		
		Albertomoreno=new JPanel();
		Albertomoreno.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(Albertomoreno);
		Albertomoreno.setLayout(null);
		
		JButton btnNewButton_250 = new JButton();
		btnNewButton_250.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		 btnNewButton_250.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Albertomoreno.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_250.setBounds(0, 0, 30,30);
		Albertomoreno.add(btnNewButton_250);
		
		JList list_56 = new JList(l1);
		list_56.setBounds(67, 54, 400,115);
		Albertomoreno.add(list_56);
		
		Salah=new JPanel();
		Salah.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(Salah);
		Salah.setLayout(null);
		
		JButton btnNewButton_251 = new JButton();
		btnNewButton_251.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_251.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salah.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_251.setBounds(0, 0, 30,30);
		Salah.add(btnNewButton_251);
		
		JList list_57 = new JList(l9);
		list_57.setBounds(49, 45,400,115);
		Salah.add(list_57);
		
		Andrewrobertson=new JPanel();
		Andrewrobertson.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(Andrewrobertson);
		Andrewrobertson.setLayout(null);
		
		JButton btnNewButton_252 = new JButton();
		btnNewButton_252.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_252.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Andrewrobertson.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_252.setBounds(0, 0, 30,30);
		Andrewrobertson.add(btnNewButton_252);
		
		JList list_58 = new JList(l2);
		list_58.setBounds(74, 50, 400,115);
		Andrewrobertson.add(list_58);
		
		Dannyings=new JPanel();
		Dannyings.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(Dannyings);
		Dannyings.setLayout(null);
		
		JButton btnNewButton_253 = new JButton();
		btnNewButton_253.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_253.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dannyings.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_253.setBounds(0, 0, 30,30);
		Dannyings.add(btnNewButton_253);
		
		JList list_59 = new JList(l3);
		list_59.setBounds(60, 49, 400,115);
		Dannyings.add(list_59);
		
		Georginio=new JPanel();
		Georginio.setBackground(new Color(0, 102, 0));
		frame.getContentPane().add(Georginio);
		Georginio.setLayout(null);
		
		JButton btnNewButton_254 = new JButton();
		btnNewButton_18.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_254.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Georginio.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_254.setBounds(0, 0, 30,30);
		Georginio.add(btnNewButton_254);
		
		JList list_60 = new JList(l4);
		list_60.setBounds(53, 56, 400,115);
		Georginio.add(list_60);
		
		Jamesmilner=new JPanel();
		frame.getContentPane().add(Jamesmilner);
		Jamesmilner.setLayout(null);
		
		JButton btnNewButton_255 = new JButton();
		btnNewButton_255.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_255.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jamesmilner.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_255.setBounds(0, 0, 30,30);
		Jamesmilner.add(btnNewButton_255);
		
		JList list_61 = new JList(l5);
		list_61.setBounds(55, 54, 400,115);
		Jamesmilner.add(list_61);
		
		Joegomez=new JPanel();
		frame.getContentPane().add(Joegomez);
		Joegomez.setLayout(null);
		
		JButton btnNewButton_256 = new JButton();
		btnNewButton_256.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_256.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Joegomez.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_256.setBounds(0, 0, 30,30);
		Joegomez.add(btnNewButton_256);
		
		JList list_62 = new JList(l6);
		list_62.setBounds(65, 47, 400,115);
		Joegomez.add(list_62);
		
		Jordanhenderson=new JPanel();
		frame.getContentPane().add(Jordanhenderson);
		Jordanhenderson.setLayout(null);
		
		JButton btnNewButton_257 = new JButton();
		btnNewButton_257.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_257.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jordanhenderson.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_257.setBounds(0, 0, 30,30);
		Jordanhenderson.add(btnNewButton_257);
		
		JList list_63 = new JList(l7);
		list_63.setBounds(55, 41, 400,115);
		Jordanhenderson.add(list_63);
		
		karius=new JPanel();
		karius.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(karius);
		karius.setLayout(null);
		
		JButton btnNewButton_258 = new JButton();
		btnNewButton_258.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_258.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				karius.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_258.setBounds(0, 0, 30,30);
		karius.add(btnNewButton_258);
		
		JList list_64 = new JList(l8);
		list_64.setBounds(59, 52, 400,115);
		karius.add(list_64);
		
		Ragnarklaven=new JPanel();
		Ragnarklaven.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(Ragnarklaven);
		Ragnarklaven.setLayout(null);
		
		JButton btnNewButton_259 = new JButton();
		btnNewButton_259.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_259.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ragnarklaven.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_259.setBounds(0, 0, 30,30);
		Ragnarklaven.add(btnNewButton_259);
		
		JList list_65 = new JList(l10);
		list_65.setBounds(57, 52, 400,115);
		Ragnarklaven.add(list_65);
		
		Robertofirmino=new JPanel();
		Robertofirmino.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(Robertofirmino);
		Robertofirmino.setLayout(null);
		
		JButton btnNewButton_260 = new JButton();
		btnNewButton_260.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_260.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Robertofirmino.setVisible(false);
				Liverpool.setVisible(true);
			}
		});
		btnNewButton_260.setBounds(0, 0, 30,30);
		Robertofirmino.add(btnNewButton_260);
		
		JList list_66 = new JList(l11);
		list_66.setBounds(60, 34, 400,115);
		Robertofirmino.add(list_66);
		
		alvero=new JPanel();
		alvero.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(alvero);
		alvero.setLayout(null);
		
		JButton btnNewButton_261 = new JButton();
		btnNewButton_261.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_261.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alvero.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_261.setBounds(0, 0,30,30);
		alvero.add(btnNewButton_261);
		
		JList list_67 = new JList(vi1);
		list_67.setFont(f);
		list_67.setBounds(29, 56,  400,115);
		alvero.add(list_67);
		
		JLabel lblNewLabel_176 = new JLabel("New label");
		lblNewLabel_176.setBounds(554, 69, 46, 14);
		alvero.add(lblNewLabel_176);

        andres=new JPanel();
        andres.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(andres);
		andres.setLayout(null);
		
		JButton btnNewButton_262 = new JButton();
		btnNewButton_262.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_262.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				andres.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_262.setBounds(0, 0,30,30);
		andres.add(btnNewButton_262);
		
		JList list_68 = new JList(vi2);
		list_68.setFont(f);
		list_68.setBounds(60, 45,  400,115);
		andres.add(list_68);
		
		jaume=new JPanel();
		jaume.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(jaume);
		jaume.setLayout(null);
		
		JButton btnNewButton_263 = new JButton();
		btnNewButton_263.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_263.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jaume.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_263.setBounds(0, 0, 30,30);
		jaume.add(btnNewButton_263);
		
		JList list_69 = new JList(vi4);
		list_69.setBounds(64, 46,  400,115);
		jaume.add(list_69);
		
		manuel=new JPanel();
		manuel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(manuel);
		manuel.setLayout(null);
		
		JButton btnNewButton_264 = new JButton();
		btnNewButton_264.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_264.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manuel.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_264.setBounds(0, 0, 30,30);
		manuel.add(btnNewButton_264);
		
		JList list_70 = new JList(vi5);
		list_70.setBounds(59, 48, 400,115);
		manuel.add(list_70);
		
		mario=new JPanel();
		mario.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(mario);
		mario.setLayout(null);
		
		JButton btnNewButton_265 = new JButton();
		btnNewButton_265.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_265.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mario.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_265.setBounds(0, 0, 30,30);
		mario.add(btnNewButton_265);
		
		JList list_71 = new JList(vi6);
		list_71.setBounds(72, 48, 400,115);
		mario.add(list_71);
		
		pablo=new JPanel();
		pablo.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(pablo);
		pablo.setLayout(null);
		
		JButton btnNewButton_266 = new JButton();
		btnNewButton_266.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_266.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pablo.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_266.setBounds(0, 0, 30,30);
		pablo.add(btnNewButton_266);
		
		JList list_72 = new JList(vi7);
		list_72.setBounds(61, 48,  400,115);
		pablo.add(list_72);
		
		soriano=new JPanel();
		soriano.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(soriano);
		soriano.setLayout(null);
		
		JButton btnNewButton_267 = new JButton();
		btnNewButton_267.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_267.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soriano.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_267.setBounds(0, 0, 30,30);
		soriano.add(btnNewButton_267);
		
		JList list_73 = new JList(vi8);
		list_73.setBounds(59, 46,  400,115);
		soriano.add(list_73);
		
		rodri=new JPanel();
		rodri.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(rodri);
		rodri.setLayout(null);
		
		JButton btnNewButton_268 = new JButton();
		btnNewButton_268.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_268.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rodri.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_268.setBounds(0, 0, 30,30);
		rodri.add(btnNewButton_268);
		
		JList list_74 = new JList(vi9);
		list_74.setBounds(64, 46,  400,115);
		rodri.add(list_74);
		
		samuel=new JPanel();
		samuel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(samuel);
		samuel.setLayout(null);
		
		JButton btnNewButton_269 = new JButton();
		btnNewButton_269.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_269.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				samuel.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_269.setBounds(0, 0, 30,30);
		samuel.add(btnNewButton_269);
		
		JList list_75 = new JList(vi10);
		list_75.setBounds(68, 44,  400,115);
		samuel.add(list_75);
		
		victor=new JPanel();
		victor.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(victor);
		victor.setLayout(null);
		
		JButton btnNewButton_270 = new JButton();
		btnNewButton_270.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_270.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				victor.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_270.setBounds(0, 0,30,30);
		victor.add(btnNewButton_270);
		
		JList list_76 = new JList(vi11);
		list_76.setBounds(73, 46,  400,115);
		victor.add(list_76);
		
		carlosbacca=new JPanel();
		carlosbacca.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(carlosbacca);
		carlosbacca.setLayout(null);
		
		JButton btnNewButton_271 = new JButton();
		btnNewButton_271.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
		btnNewButton_271.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carlosbacca.setVisible(false);
				Villarreal.setVisible(true);
			}
		});
		btnNewButton_271.setBounds(0, 0, 30,30);
		carlosbacca.add(btnNewButton_271);
		
		JList list_77 = new JList(vi3);
		list_77.setBackground(SystemColor.inactiveCaption);
		list_77.setFont(new Font("Tahoma", Font.BOLD, 13));
		list_77.setBounds(74, 49, 400,115);
		carlosbacca.add(list_77);

		    AntoineGriezmann=new JPanel();
		    AntoineGriezmann.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(AntoineGriezmann);
			AntoineGriezmann.setLayout(null);
			
			 	JButton btnNewButton_300 = new JButton();
			 	btnNewButton_300.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			 	btnNewButton_300.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AntoineGriezmann.setVisible(false);
						AtleticoMadrid.setVisible(true);
					}
				});
			btnNewButton_300.setBounds(0, 0, 30,30);
			AntoineGriezmann.add(btnNewButton_300);
			
			JList list_100 = new JList(at1);
			list_100.setBackground(SystemColor.inactiveCaption);
			list_100.setFont(f);
			list_100.setBounds(67, 54, 400,115);
			AntoineGriezmann.add(list_100);
			
			JLabel lblNewLabel_126 = new JLabel();
			lblNewLabel_126.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Antoine Griezmann.jpg")));
			lblNewLabel_126.setBounds(561, 54, 120, 100);
			AntoineGriezmann.add(lblNewLabel_126);
			
		    AntonioRodriguez=new JPanel();
		    AntonioRodriguez.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(AntonioRodriguez);
			AntonioRodriguez.setLayout(null);
			
			JButton btnNewButton_301 = new JButton();
			btnNewButton_301.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_301.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AntonioRodriguez.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_301.setBounds(0, 0,30,30);
			AntonioRodriguez.add(btnNewButton_301);
			
			JList list_111 = new JList(at2);
			list_111.setBackground(SystemColor.inactiveCaption);
			list_111.setFont(f);
			list_111.setBounds(67, 54,  400,115);
			AntonioRodriguez.add(list_111); 
			
			
			AntonioMoya=new JPanel();
			AntonioMoya.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(AntonioMoya);
			AntonioMoya.setLayout(null);
			
			JButton btnNewButton_302 = new JButton();
			btnNewButton_302.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_302.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AntonioMoya.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_302.setBounds(0, 0,30,30);
			AntonioMoya.add(btnNewButton_302);
			
			JList list_112 = new JList(at11);
			list_112.setBackground(SystemColor.inactiveCaption);
			list_112.setFont(f);
			list_112.setBounds(67, 54,  400,115);
			AntonioMoya.add(list_112); 
			
			DiegoCosta=new JPanel();
			DiegoCosta.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(DiegoCosta);
			DiegoCosta.setLayout(null);
			
			JButton btnNewButton_303 = new JButton();
			btnNewButton_303.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_303.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DiegoCosta.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_303.setBounds(0, 0, 30,30);
			DiegoCosta.add(btnNewButton_303);
			
			JList list_113 = new JList(at3);
			list_113.setBackground(SystemColor.inactiveCaption);
			list_113.setFont(f);
			list_113.setBounds(67, 54, 400,115);
			DiegoCosta.add(list_113); 
			
			FernandoTorres=new JPanel();
			FernandoTorres.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(FernandoTorres);
			FernandoTorres.setLayout(null);
			
			JButton btnNewButton_304 = new JButton();
			btnNewButton_304.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_304.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FernandoTorres.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_304.setBounds(0, 0, 30,30);
			FernandoTorres.add(btnNewButton_304);
			
			JList list_114 = new JList(at4);
			list_114.setBackground(SystemColor.inactiveCaption);
			list_114.setFont(f);
			list_114.setBounds(67, 54,  400,115);
			FernandoTorres.add(list_114); 
			
			FilipeLuis=new JPanel();
			FilipeLuis.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(FilipeLuis);
			FilipeLuis.setLayout(null);
			
			JButton btnNewButton_305 = new JButton();
			btnNewButton_305.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_305.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FilipeLuis.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_305.setBounds(0, 0, 30,30);
			FilipeLuis.add(btnNewButton_305);
			
			JList list_115 = new JList(at5);
			list_115.setBackground(SystemColor.inactiveCaption);
			list_115.setFont(f);
			list_115.setBounds(67, 54,  400,115);
			FilipeLuis.add(list_115); 
			
			GabrielFernandez=new JPanel();
			GabrielFernandez.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(GabrielFernandez);
			GabrielFernandez.setLayout(null);
			
			JButton btnNewButton_306 = new JButton();
			btnNewButton_306.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));;
			btnNewButton_306.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GabrielFernandez.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_306.setBounds(0, 0,30,30);
			GabrielFernandez.add(btnNewButton_306);
			
			JList list_116 = new JList(at6);
			list_116.setBackground(SystemColor.inactiveCaption);
			list_116.setFont(f);
			list_116.setBounds(67, 54,  400,115);
			GabrielFernandez.add(list_116); 
			
			Janoblak=new JPanel();
			Janoblak.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(Janoblak);
			Janoblak.setLayout(null);
			
			
			JButton btnNewButton_307 = new JButton();
			btnNewButton_307.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_307.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Janoblak.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_307.setBounds(0, 0, 30,30);
			Janoblak.add(btnNewButton_307);
			
			JList list_117 = new JList(at7);
			list_117.setBackground(SystemColor.inactiveCaption);
			list_117.setFont(f);
			list_117.setBounds(67, 54,  400,115);
			Janoblak.add(list_117); 
			
			Juanfrancisco=new JPanel();
			Juanfrancisco.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(Juanfrancisco);
			Juanfrancisco.setLayout(null);
			
			JButton btnNewButton_308 = new JButton();
			btnNewButton_308.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_308.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Juanfrancisco.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_308.setBounds(0, 0, 30,30);
			Juanfrancisco.add(btnNewButton_308);
			
			JList list_118 = new JList(at8);
			list_118.setBackground(SystemColor.inactiveCaption);
			list_118.setFont(f);
			list_118.setBounds(67, 54,  400,115);
			Juanfrancisco.add(list_118); 
			
			Lucasbernard=new JPanel();
			Lucasbernard.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(Lucasbernard);
			Lucasbernard.setLayout(null);
			
			JButton btnNewButton_309 = new JButton();
			btnNewButton_309.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_309.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Lucasbernard.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_309.setBounds(0, 0, 30,30);
			Lucasbernard.add(btnNewButton_309);
			
			JList list_119 = new JList(at10);
			list_119.setBackground(SystemColor.inactiveCaption);
			list_119.setFont(f);
			list_119.setBounds(67, 54, 400,115);
			Lucasbernard.add(list_119); 
			
			koke=new JPanel();
			koke.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(koke);
			koke.setLayout(null);
			
			
			JButton btnNewButton_310 = new JButton();
			btnNewButton_310.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_310.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					koke.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btnNewButton_310.setBounds(0, 0, 30,30);
			koke.add(btnNewButton_310);
			
			JList list_120 = new JList(at9);
			list_120.setBackground(SystemColor.inactiveCaption);
			list_120.setFont(f);
			list_120.setBounds(67, 54, 400,115);
			koke.add(list_120); 

			AntonioConte=new JPanel();
			AntonioConte.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(AntonioConte);
			AntonioConte.setLayout(null);
			
			JButton btn_310 = new JButton();
			btn_310.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_310.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AntonioConte.setVisible(false);
					Chelsea.setVisible(true);
				}
			});
			btn_310.setBounds(0, 0, 30,30);
			AntonioConte.add(btn_310);
			
			JList l_120 = new JList(ac);
			l_120.setBackground(SystemColor.inactiveCaption);
			l_120.setFont(f);
			l_120.setBounds(67, 54, 400,115);
			AntonioConte.add(l_120); 
			
			JLabel lblNewLabel_177 = new JLabel("New label");
			lblNewLabel_177.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/antonio conte.jpg")));
			lblNewLabel_177.setBounds(474, 56, 119, 100);
			AntonioConte.add(lblNewLabel_177);

			Diegosimeone=new JPanel();
			Diegosimeone.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(Diegosimeone);
			Diegosimeone.setLayout(null);
			
			JButton btn_311 = new JButton();
			btn_311.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_311.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Diegosimeone.setVisible(false);
					AtleticoMadrid.setVisible(true);
				}
			});
			btn_311.setBounds(0, 0,30,30);
			Diegosimeone.add(btn_311);
			
			JList l_121 = new JList(ds);
			l_121.setBackground(SystemColor.inactiveCaption);
			l_121.setFont(f);
			l_121.setBounds(67, 54, 400,115);
			Diegosimeone.add(l_121);
			
			JLabel lblNewLabel_178 = new JLabel("New label");
			lblNewLabel_178.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/diego simeone.jpg")));
			lblNewLabel_178.setBounds(529, 54, 122, 100);
			Diegosimeone.add(lblNewLabel_178);

			ErnestoValverde=new JPanel();
			ErnestoValverde.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(ErnestoValverde);
			ErnestoValverde.setLayout(null);
			
			JButton btn_312 = new JButton();
			btn_312.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_312.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ErnestoValverde.setVisible(false);
					Barcelona.setVisible(true);
				}
			});
			btn_312.setBounds(0, 0, 30,30);
			ErnestoValverde.add(btn_312);
			
			JList l_122 = new JList(ev);
			l_122.setBackground(SystemColor.inactiveCaption);
			l_122.setFont(f);
			l_122.setBounds(67, 54, 400,115);
			ErnestoValverde.add(l_122);
			
			JLabel lblNewLabel_180 = new JLabel("New label");
			lblNewLabel_180.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/Ernesto Valverde.jpg")));
			lblNewLabel_180.setBounds(523, 54, 122, 100);
			ErnestoValverde.add(lblNewLabel_180);

			Javiercalleja=new JPanel();
			Javiercalleja.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(Javiercalleja);
			Javiercalleja.setLayout(null);
			
			JButton btn_313 = new JButton();
			btn_313.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_313.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Javiercalleja.setVisible(false);
					Villarreal.setVisible(true);
				}
			});
			btn_313.setBounds(0, 0, 30,30);
			Javiercalleja.add(btn_313);
			
			JList l_123 = new JList(jc);
			l_123.setBackground(SystemColor.inactiveCaption);
			l_123.setFont(f);
			l_123.setBounds(67, 54, 400,115);
			Javiercalleja.add(l_123);
			
			JLabel lblNewLabel_181 = new JLabel("New label");
			lblNewLabel_181.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/javier calleja.jpg")));
			lblNewLabel_181.setBounds(501, 54, 125, 100);
			Javiercalleja.add(lblNewLabel_181);

			JoseMourinho=new JPanel();
			JoseMourinho.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(JoseMourinho);
			JoseMourinho.setLayout(null);
			
			JButton btn_314 = new JButton();
			btn_314.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_314.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JoseMourinho.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btn_314.setBounds(0, 0, 30,30);
			JoseMourinho.add(btn_314);
			
			JList l_124 = new JList(jm);
			l_124.setBackground(SystemColor.inactiveCaption);
			l_124.setFont(f);
			l_124.setBounds(67, 54, 407,126);
			JoseMourinho.add(l_124);

			Jurgenklopp=new JPanel();
			Jurgenklopp.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(Jurgenklopp);
			Jurgenklopp.setLayout(null);
			
			JButton btn_315 = new JButton();
			btn_315.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_315.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Jurgenklopp.setVisible(false);
					Liverpool.setVisible(true);
				}
			});
			btn_315.setBounds(0, 0, 30,30);
			Jurgenklopp.add(btn_315);
			
			JList l_125 = new JList(jk);
			l_125.setBackground(SystemColor.inactiveCaption);
			l_125.setFont(f);
			l_125.setBounds(67, 54, 400,115);
			Jurgenklopp.add(l_125);

			MarcelinoGarcía=new JPanel();
			MarcelinoGarcía.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(MarcelinoGarcía);
			MarcelinoGarcía.setLayout(null);
			
			JButton btn_316 = new JButton();
			btn_316.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_316.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MarcelinoGarcía.setVisible(false);
					Valencia.setVisible(true);
				}
			});
			btn_316.setBounds(0, 0, 30,30);
			MarcelinoGarcía.add(btn_316);
			
			JList l_126 = new JList(mg);
			l_126.setBackground(SystemColor.inactiveCaption);
			l_126.setFont(f);
			l_126.setBounds(67, 54, 400,115);
			MarcelinoGarcía.add(l_126);
			
			JLabel lblNewLabel_182 = new JLabel("New label");
			lblNewLabel_182.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/Marcelino Garc\u00EDa.jpg")));
			lblNewLabel_182.setBounds(505, 47, 120, 106);
			MarcelinoGarcía.add(lblNewLabel_182);

			MauricioPochettino=new JPanel();
			MauricioPochettino.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(MauricioPochettino);
			MauricioPochettino.setLayout(null);
			
			JButton btn_317 = new JButton();
			btn_317.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_317.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MauricioPochettino.setVisible(false);
					Tottenham.setVisible(true);
				}
			});
			btn_317.setBounds(0, 0,30,30);
			MauricioPochettino.add(btn_317);
			
			JList l_127 = new JList(mc);
			l_127.setBackground(SystemColor.inactiveCaption);
			l_127.setFont(f);
			l_127.setBounds(67, 54, 400,115);
			MauricioPochettino.add(l_127);

			ZinedineZidane=new JPanel();
			ZinedineZidane.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(ZinedineZidane);
			ZinedineZidane.setLayout(null);
			
			JButton btn_318 = new JButton();
			btn_318.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_318.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ZinedineZidane.setVisible(false);
					RealMadrid.setVisible(true);
				}
			});
			btn_318.setBounds(0, 0, 30,30);
			ZinedineZidane.add(btn_318);
			
			JList l_128 = new JList(zz);
			l_128.setBackground(SystemColor.inactiveCaption);
			l_128.setFont(f);
			l_128.setBounds(67, 54, 400,115);
			ZinedineZidane.add(l_128);
			
			JLabel lblNewLabel_179 = new JLabel("New label");
			lblNewLabel_179.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/ALLC/Zinedine Zidane1.jpg")));
			lblNewLabel_179.setBounds(551, 62, 121, 100);
			ZinedineZidane.add(lblNewLabel_179);

			JosepGuardiola=new JPanel();
			JosepGuardiola.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(JosepGuardiola);
			JosepGuardiola.setLayout(null);
			
			JButton btn_319 = new JButton();
			btn_319.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btn_319.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JosepGuardiola.setVisible(false);
					Barcelona.setVisible(true);
				}
			});
			btn_319.setBounds(0, 0, 30,30);
			JosepGuardiola.add(btn_319);
			
			JList l_129 = new JList(jg);
			l_129.setBackground(SystemColor.inactiveCaption);
			l_129.setFont(f);
			l_129.setBounds(67, 54, 400,115);
			JosepGuardiola.add(l_129); 
			
			list_11.setFont(f);
		
			list_12.setForeground(Color.white);
			list_12.setFont(f);
			list_12.setBackground(new Color(47,99,79));
			//list_12.setBounds(80,53,290,80);
			list_13.setForeground(Color.white);
			list_13.setFont(f);
			list_13.setBackground(new Color(47,99,79));
			//list_13.setBounds(80,53,290,80);
			list_14.setForeground(Color.white);
			list_14.setFont(f);
			list_14.setBackground(new Color(47,99,79));
			//list_14.setBounds(80,53,290,80);
			list_15.setForeground(Color.white);
			list_15.setFont(f);
			list_15.setBackground(new Color(47,99,79));
			//list_15.setBounds(80,53,290,80);
			list_16.setForeground(Color.white);
			list_16.setFont(f);
			list_16.setBackground(new Color(47,99,79));
			
			JLabel lblNewLabel_107 = new JLabel("");
			lblNewLabel_107.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Barca/suarez.jpg")));
			lblNewLabel_107.setBounds(581, 50, 100, 104);
			LuizSuarez.add(lblNewLabel_107);
			//list_16.setBounds(80,53,290,80);
			list_17.setForeground(Color.white);
			list_17.setFont(f);
			list_17.setBackground(new Color(47,99,79));
			//list_17.setBounds(80,53,290,80);
			list_18.setForeground(Color.white);
			list_18.setFont(f);
			list_18.setBackground(new Color(47,99,79));
			//list_18.setBounds(80,53,290,80);
			list_19.setForeground(Color.white);
			list_19.setFont(f);
			list_19.setBackground(new Color(47,99,79));

			list_20.setForeground(Color.white);
			list_20.setFont(f);
			list_20.setBackground(new Color(47,99,79));
			
			list_78.setBackground(SystemColor.inactiveCaption);
			list_78.setFont(f);
			garay.add(list_78);

			list_79.setBackground(SystemColor.inactiveCaption);
			list_79.setFont(f);
			guedess.add(list_79);

			list_80.setBackground(SystemColor.inactiveCaption);
			list_80.setFont(f);
			kondogbia.add(list_80);

			list_81.setBackground(SystemColor.inactiveCaption);
			list_81.setFont(f);
			latoo.add(list_81);

			list_82.setBackground(SystemColor.inactiveCaption);
			list_82.setFont(f);;
			mina.add(list_82);

			list_83.setBackground(SystemColor.inactiveCaption);
			list_83.setFont(f);
			montoyaa.add(list_83);

			list_84.setBackground(SystemColor.inactiveCaption);
			list_84.setFont(f);
			neto.add(list_84);

			JList list_85 = new JList();
			list_85.setBounds(98, 58, 1, 1);
			rodrogoo.add(list_85);
			list_85.setBackground(SystemColor.inactiveCaption);
			list_85.setFont(f);
			rodrogoo.add(list_85);

			list_68.setBackground(SystemColor.inactiveCaption);
			list_68.setFont(f);
			andres.add(list_68);

			list_69.setBackground(SystemColor.inactiveCaption);
			list_69.setFont(f);
			jaume.add(list_69);

			list_70.setBackground(SystemColor.inactiveCaption);
			list_70.setFont(f);
			manuel.add(list_70);

			list_71.setBackground(SystemColor.inactiveCaption);
			list_71.setFont(f);
			mario.add(list_71);

			list_72.setBackground(SystemColor.inactiveCaption);
			list_72.setFont(f);
			pablo.add(list_72);

			list_73.setBackground(SystemColor.inactiveCaption);
			list_73.setFont(f);
			soriano.add(list_73);

			list_74.setBackground(SystemColor.inactiveCaption);
			list_74.setFont(f);
			rodri.add(list_74);

			list_75.setBackground(SystemColor.inactiveCaption);
			list_75.setFont(f);
			samuel.add(list_75);

			list_76.setBackground(SystemColor.inactiveCaption);
			list_76.setFont(f);
			victor.add(list_76);
		
			list_45.setForeground(Color.white);
			list_45.setFont(f);
			list_45.setBackground(new Color(47,99,79));

			list_46.setForeground(Color.white);
			list_46.setFont(f);
			list_46.setBackground(new Color(47,99,79));

			list_47.setForeground(Color.white);
			list_47.setFont(f);
			list_47.setBackground(new Color(47,99,79));

			list_48.setForeground(Color.white);
			list_48.setFont(f);
			list_48.setBackground(new Color(47,99,79));

			list_49.setForeground(Color.white);
			list_49.setFont(f);
			list_49.setBackground(new Color(47,99,79));

			list_50.setForeground(Color.white);
			list_50.setFont(f);
			list_50.setBackground(new Color(51, 153, 0));

			list_51.setForeground(Color.white);
			list_51.setFont(f);
			list_51.setBackground(new Color(47,99,79));

			list_52.setForeground(Color.white);
			list_52.setFont(f);
			list_52.setBackground(new Color(47,99,79));

			list_53.setForeground(Color.white);
			list_53.setFont(f);
			list_53.setBackground(new Color(47,99,79));

			list_54.setForeground(Color.white);
			list_54.setFont(f);
			list_54.setBackground(new Color(47,99,79));
		
			list_3.setFont(f);
			list_3.setBackground(SystemColor.inactiveCaption);
			
			JLabel lblNewLabel_108 = new JLabel();
			lblNewLabel_108.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/Cesc F\u00E0bregas.jpg")));
			lblNewLabel_108.setBounds(535, 71, 116, 100);
			Cescfabregas.add(lblNewLabel_108);
			list_4.setFont(f);
			list_4.setBackground(SystemColor.inactiveCaption);
			
			JLabel lblNewLabel_109 = new JLabel();
			lblNewLabel_109.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/David Luiz.jpg")));
			lblNewLabel_109.setBounds(531, 60, 120,100);
			Davidluiz.add(lblNewLabel_109);
			JLabel lblNewLabel_110 = new JLabel();
			lblNewLabel_110.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/Eden Hazard.jpg")));
			lblNewLabel_110.setBounds(531, 60, 120,100);
			Edenhazard.add(lblNewLabel_110);
			JLabel lblNewLabel_111 = new JLabel();
			lblNewLabel_111.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/Gary Cahill.jpg")));
			lblNewLabel_111.setBounds(531, 60, 120,100);
			cahil.add(lblNewLabel_111);
			JLabel lblNewLabel_112 = new JLabel();
			lblNewLabel_112.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/giroud.jpg")));
			lblNewLabel_112.setBounds(531, 60, 120,100);
			giroud.add(lblNewLabel_112);
			
			JLabel lblNewLabe_114 = new JLabel();
			lblNewLabe_114.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/Morata.jpg")));
			lblNewLabe_114.setBounds(531, 60, 120,100);
			morata.add(lblNewLabe_114);
			JLabel lblNewLabe_115 = new JLabel();
			lblNewLabe_115.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/N'Golo Kanté.jpg")));
			lblNewLabe_115.setBounds(531, 60, 120,100);
			kante.add(lblNewLabe_115);
			JLabel lblNewLabe_116 = new JLabel();
			lblNewLabe_116.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/Thibaut Courtois.jpg")));
			lblNewLabe_116.setBounds(531, 60, 120,100);
			Thibautcourtois.add(lblNewLabe_116);
			JLabel lblNewLabe_117 = new JLabel();
			lblNewLabe_117.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/Tiémoué Bakayoko.jpg")));
			lblNewLabe_117.setBounds(531, 60, 120,100);
			tiemoue.add(lblNewLabe_117);
			JLabel lblNewLabe_118 = new JLabel();
			lblNewLabe_118.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/Willian.jpg")));
			lblNewLabe_118.setBounds(531, 60, 120,100);
			willian.add(lblNewLabe_118);
			
			list_5.setFont(f);
			list_5.setBackground(SystemColor.inactiveCaption);
			list_6.setFont(f);
			list_6.setBackground(SystemColor.inactiveCaption);
			list_6.setFont(f);
			list_7.setBackground(SystemColor.inactiveCaption);
			list_7.setFont(f);
			list_7.setBackground(SystemColor.inactiveCaption);
			
			JLabel lblNewLabel_113 = new JLabel("");
			lblNewLabel_113.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Chelsea/Marcos Alonso.png")));
			lblNewLabel_113.setBounds(532, 74, 120, 100);
			Marcosalonso.add(lblNewLabel_113);
			list_8.setFont(f);
			list_8.setBackground(SystemColor.inactiveCaption);
			list_9.setFont(f);
			list_9.setBackground(SystemColor.inactiveCaption);
			list_10.setFont(f);
			list_10.setBackground(SystemColor.inactiveCaption);
			list_11.setFont(f);
			list_11.setBackground(SystemColor.inactiveCaption);
			
			list_56.setForeground(Color.white);
			list_56.setFont(f);
			list_56.setBackground(new Color(47,99,79));
			
			JLabel lblNewLabel_115 = new JLabel();
			lblNewLabel_115.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Alberto Moreno.jpg")));
			lblNewLabel_115.setBounds(573, 54, 120, 100);
			Albertomoreno.add(lblNewLabel_115);
			
			JLabel lblNewLabel_116 = new JLabel();
			lblNewLabel_116.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Andrew Robertson.jpg")));
			lblNewLabel_116.setBounds(573, 54, 120, 100);
			Andrewrobertson.add(lblNewLabel_116);
			
			JLabel lblNewLabel_117 = new JLabel();
			lblNewLabel_117.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Danny Ings.jpg")));
			lblNewLabel_117.setBounds(573, 54, 120, 100);
			Dannyings.add(lblNewLabel_117);
			
			JLabel lblNewLabel_118 = new JLabel();
			lblNewLabel_118.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Georginio Wijnaldum.jpg")));
			lblNewLabel_118.setBounds(573, 54, 120, 100);
			Georginio.add(lblNewLabel_118);
			
			JLabel lblNewLabel_119 = new JLabel();
			lblNewLabel_119.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/James Milner.jpg")));
			lblNewLabel_119.setBounds(573, 54, 120, 100);
			Jamesmilner.add(lblNewLabel_119);
			
			JLabel lblNewLabel_120 = new JLabel();
			lblNewLabel_120.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Joe Gomez.jpg")));
			lblNewLabel_120.setBounds(573, 54, 120, 100);
			Joegomez.add(lblNewLabel_120);
			
			JLabel lblNewLabel_121 = new JLabel();
			lblNewLabel_121.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Jordan Henderson.jpg")));
			lblNewLabel_121.setBounds(573, 54, 120, 100);
			Jordanhenderson.add(lblNewLabel_121);
			
			JLabel lblNewLabel_122 = new JLabel();
			lblNewLabel_122.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Karius.jpg")));
			lblNewLabel_122.setBounds(573, 54, 120, 100);
			karius.add(lblNewLabel_122);
			
			JLabel lblNewLabel_123 = new JLabel();
			lblNewLabel_123.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Mohamed Salah.jpg")));
			lblNewLabel_123.setBounds(573, 54, 120, 100);
		    Salah.add(lblNewLabel_123);
		    
		    JLabel lblNewLabel_124= new JLabel();
			lblNewLabel_124.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Ragnar Klavan.jpg")));
			lblNewLabel_124.setBounds(573, 54, 120, 100);
			Ragnarklaven.add(lblNewLabel_124);
		    
		    JLabel lblNewLabel_125 = new JLabel();
			lblNewLabel_125.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Liverpool/Roberto Firmino.jpg")));
			lblNewLabel_125.setBounds(573, 54, 120, 100);
			Robertofirmino.add(lblNewLabel_125);

			list_57.setForeground(Color.white);
			list_57.setFont(f);
			list_57.setBackground(new Color(47,99,79));

			list_58.setForeground(Color.white);
			list_58.setFont(f);
			list_58.setBackground(new Color(47,99,79));

			list_59.setForeground(Color.white);
			list_59.setFont(f);
			list_59.setBackground(new Color(47,99,79));

			list_60.setForeground(Color.white);
			list_60.setFont(f);
			list_60.setBackground(new Color(0, 102, 51));

			list_61.setForeground(Color.white);
			list_61.setFont(f);
			list_61.setBackground(new Color(47,99,79));

			list_62.setForeground(Color.white);
			list_62.setFont(f);
			list_62.setBackground(new Color(47,99,79));

			list_63.setForeground(Color.white);
			list_63.setFont(f);
			list_63.setBackground(new Color(47,99,79));

			list_64.setForeground(Color.white);
			list_64.setFont(f);
			list_64.setBackground(new Color(47,99,79));

			list_65.setForeground(Color.white);
			list_65.setFont(f);
			list_65.setBackground(new Color(47,99,79));

			list_66.setForeground(Color.white);
			list_66.setFont(f);
			list_66.setBackground(new Color(47,99,79));
			
			list_23.setBackground(SystemColor.inactiveCaption);
			list_23.setFont(f);
			list_23.setBounds(70,53,290,80);
			daniel.add(list_23);

			list_23.setBackground(SystemColor.inactiveCaption);
			list_23.setFont(f);
			
			JLabel lblNewLabel_139 = new JLabel();
			lblNewLabel_139.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/tot/deniel.jpg")));
			lblNewLabel_139.setBounds(481, 45, 220, 173);
			daniel.add(lblNewLabel_139);
			
			list_24.setBounds(70,53,290,80);
			hugo.add(list_24);
			
			JLabel lblNewLabel_140 = new JLabel();
			lblNewLabel_140.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/tot/hugo.jpg")));
			lblNewLabel_140.setBounds(467, 53, 120,100);
			hugo.add(lblNewLabel_140);

			list_25.setBackground(SystemColor.inactiveCaption);
			list_25.setFont(f);
			list_25.setBounds(70,53,290,80);
			eric.add(list_25);

			list_26.setBackground(SystemColor.inactiveCaption);
			list_26.setFont(f);
			list_26.setBounds(70,53,290,80);
			harry.add(list_26);

			list_27.setBackground(SystemColor.inactiveCaption);
			list_27.setFont(f);
			list_27.setBounds(70,53,290,80);
			juan.add(list_27);

			list_28.setBackground(SystemColor.inactiveCaption);
			list_28.setFont(f);
			list_28.setBounds(70,53,290,80);
			kazaia.add(list_28);

			list_29.setBackground(SystemColor.inactiveCaption);
			list_29.setFont(f);
			list_29.setBounds(70,53,290,80);
			liorente.add(list_29);

			list_30.setBackground(SystemColor.inactiveCaption);
			list_30.setFont(f);
			list_30.setBounds(70,53,290,80);
			lucas.add(list_30);

			list_32.setBackground(SystemColor.inactiveCaption);
			list_32.setFont(f);
			list_32.setBounds(70,53,290,80);
			tobias.add(list_32);

			list_31.setBackground(SystemColor.inactiveCaption);
			list_31.setFont(f);
			list_31.setBounds(70,53,290,80);
			serge.add(list_31);

			list_33.setBackground(SystemColor.inactiveCaption);
			list_33.setFont(f);
			list_33.setBounds(70,53,290,80);
			victor1.add(list_33);

			JLabel lblNewLabel_150 = new JLabel();
			lblNewLabel_150.setBounds(499, 50, 120, 100);
			bale.add(lblNewLabel_150);
			
			JLabel lblNewLabel_172 = new JLabel();
			lblNewLabel_172.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/Bale.jpg")));
			lblNewLabel_172.setBounds(570, 83,120,100);
			bale.add(lblNewLabel_172);

			JLabel lblNewLabel_151 = new JLabel();
			lblNewLabel_151.setBounds(499, 50, 120, 100);
			benzama.add(lblNewLabel_151);
			
			JLabel lblNewLabel_173 = new JLabel();
			lblNewLabel_173.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/Benzama.jpg")));
			lblNewLabel_173.setBounds(585, 62, 120,100);
			benzama.add(lblNewLabel_173);

			JLabel lblNewLabel_152 = new JLabel();
			lblNewLabel_152.setBounds(499, 50, 120, 100);
			carvajal.add(lblNewLabel_152);
			
			JLabel lblNewLabel_174 = new JLabel("New label");
			lblNewLabel_174.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/Carvajal.jpg")));
			lblNewLabel_174.setBounds(588, 52, 46, 14);
			carvajal.add(lblNewLabel_174);

			JLabel lblNewLabel_153 = new JLabel();
			lblNewLabel_153.setBounds(499, 50, 120, 100);
			casemiro.add(lblNewLabel_153);
			
			JLabel lblNewLabel_175 = new JLabel();
			lblNewLabel_175.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/casemiro.jpg")));
			lblNewLabel_175.setBounds(605, 71, 120,100);
			casemiro.add(lblNewLabel_175);
			
			JLabel lblNewLabel_9 = new JLabel();
			lblNewLabel_9.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/Marcelo (2).jpg")));
			lblNewLabel_9.setBounds(552, 34, 120,100);
			marcelo.add(lblNewLabel_9);

			JLabel lblNewLabel_157 = new JLabel();
			lblNewLabel_157.setBounds(499, 50, 120, 100);
			isco.add(lblNewLabel_157);
			
			JLabel lblNewLabel_169 = new JLabel();
			lblNewLabel_169.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/Isco.jpg")));
			lblNewLabel_169.setBounds(630, 79, 120,100);
			isco.add(lblNewLabel_169);

			JLabel lblNewLabel_158 = new JLabel();
			lblNewLabel_158.setBounds(499, 50, 120, 100);
			modrich.add(lblNewLabel_158);
			
			JLabel lblNewLabel_171 = new JLabel();
			lblNewLabel_171.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/Modrich.jpg")));
			lblNewLabel_171.setBounds(568, 70,120,100);
			modrich.add(lblNewLabel_171);

			JLabel lblNewLabel_159 = new JLabel();
			lblNewLabel_159.setBounds(499, 50, 120, 100);
			nacho.add(lblNewLabel_159);
			
			JLabel lblNewLabel_168 = new JLabel();
			lblNewLabel_168.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/NACHO.jpg")));
			lblNewLabel_168.setBounds(592, 66, 120,100);
			nacho.add(lblNewLabel_168);

			JLabel lblNewLabel_160 = new JLabel();
			lblNewLabel_160.setBounds(499, 50, 120, 100);
			navas.add(lblNewLabel_160);
			
			JLabel lblNewLabel_170 = new JLabel();
			lblNewLabel_170.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/Navas.jpg")));
			lblNewLabel_170.setBounds(561, 59, 120,100);
			navas.add(lblNewLabel_170);

			JLabel lblNewLabe_161 = new JLabel();
			lblNewLabe_161.setBounds(499, 50, 120, 100);
			ramos.add(lblNewLabe_161);
			
			JLabel lblNewLabel_161 = new JLabel();
			lblNewLabel_161.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/real/Ramos.jpg")));
			lblNewLabel_161.setBounds(565, 60, 120,100);
			ramos.add(lblNewLabel_161);
			
			JLabel lblNewLabel_127 = new JLabel();
			lblNewLabel_127.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/antonio montoro.jpg")));
			lblNewLabel_127.setBounds(561, 54, 120, 100);
			AntonioRodriguez.add(lblNewLabel_127);

			JLabel lblNewLabel_128 = new JLabel();
			lblNewLabel_128.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Lucas Hernández.jpg")));
			lblNewLabel_128.setBounds(561, 54, 120, 100);
			Lucasbernard.add(lblNewLabel_128);

			JLabel lblNewLabel_129 = new JLabel();
			lblNewLabel_129.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Diego Costa.jpg")));
			lblNewLabel_129.setBounds(561, 54, 120, 100);
			DiegoCosta.add(lblNewLabel_129);

			JLabel lblNewLabel_130 = new JLabel();
			lblNewLabel_130.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Fernando Torres.jpg")));
			lblNewLabel_130.setBounds(561, 54, 120, 100);
			FernandoTorres.add(lblNewLabel_130);

			JLabel lblNewLabel_131 = new JLabel();
			lblNewLabel_131.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Filipe Luís.jpg")));
			lblNewLabel_131.setBounds(561, 54, 120, 100);
			FilipeLuis.add(lblNewLabel_131);

			JLabel lblNewLabel_132 = new JLabel();
			lblNewLabel_132.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Gabi.jpg")));
			lblNewLabel_132.setBounds(561, 54, 120, 100);
			GabrielFernandez.add(lblNewLabel_132);

			JLabel lblNewLabel_133 = new JLabel();
			lblNewLabel_133.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Jan Oblak.jpg")));
			lblNewLabel_133.setBounds(561, 54, 120, 100);
			Janoblak.add(lblNewLabel_133);

			JLabel lblNewLabel_134 = new JLabel();
			lblNewLabel_134.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Juanfran.jpg")));
			lblNewLabel_134.setBounds(561, 54, 120, 100);
			Juanfrancisco.add(lblNewLabel_134);

			JLabel lblNewLabel_135 = new JLabel();
			lblNewLabel_135.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Koke.jpg")));
			lblNewLabel_135.setBounds(561, 54, 120, 100);
			koke.add(lblNewLabel_135);

			JLabel lblNewLabel_136 = new JLabel();
			lblNewLabel_136.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/Atlet/Toni Moya.jpg")));
			lblNewLabel_136.setBounds(561, 54, 120, 100);
			AntonioMoya.add(lblNewLabel_136);

			sanchez=new JPanel();
			sanchez.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(sanchez);
			sanchez.setLayout(null);
			
			JButton btnNewButton_291 = new JButton();
			btnNewButton_291.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_291.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sanchez.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnNewButton_291.setBounds(0, 0, 30,30);
			sanchez.add(btnNewButton_291);
			
			JList list_88 = new JList(mu1);
			list_88.setBackground(SystemColor.inactiveCaption);
			list_88.setFont(f1);
			list_88.setBounds(70, 43, 363,103);
			sanchez.add(list_88);
			
			JLabel lblNewLabel_138 = new JLabel();
			lblNewLabel_138.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/sk/Alexis Sanchez.jpg")));
			lblNewLabel_138.setBounds(569, 43, 200,200);
			sanchez.add(lblNewLabel_138);
			
			young=new JPanel();
			frame.getContentPane().add(sanchez);
			young.setLayout(null);
			
			degea=new JPanel();
			degea.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(degea);
			degea.setLayout(null);
			
			lukeshaw=new JPanel();
			lukeshaw.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(lukeshaw);
			lukeshaw.setLayout(null);
			
			fellani=new JPanel();
			fellani.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(fellani);
			fellani.setLayout(null);
			
			philjones=new JPanel();
			philjones.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(philjones);
			philjones.setLayout(null);
			
			pogba=new JPanel();
			pogba.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(pogba);
			pogba.setLayout(null);
			
			carrick=new JPanel();
			carrick.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(carrick);
			carrick.setLayout(null);
			
			baily=new JPanel();
			baily.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(baily);
			baily.setLayout(null);
			
			lukaku=new JPanel();
			lukaku.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(lukaku);
			lukaku.setLayout(null);
			
			mata=new JPanel();
			mata.setBackground(SystemColor.inactiveCaption);
			frame.getContentPane().add(mata);
			mata.setLayout(null);
			
			JButton btnNewButton_292 = new JButton();
			btnNewButton_292.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_292.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					young.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnNewButton_292.setBounds(0, 0,30,30);
			young.add(btnNewButton_292);
						
			JList list_89 = new JList(mu2);
			list_89.setFont(f1);
			list_89.setBounds(67, 34, 350,100);
			young.add(list_89);

			JButton btnNewButton_293 = new JButton();
			btnNewButton_293.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_293.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					degea.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnNewButton_293.setBounds(0, 0,20,20);
			degea.add(btnNewButton_293);
						
			JList list_90 = new JList(mu3);
			list_90.setBackground(SystemColor.inactiveCaption);
			list_90.setFont(f1);
			list_90.setBounds(67, 34, 270,102);
			degea.add(list_90);

			JButton btnNewButton_294 = new JButton();
			btnNewButton_294.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_294.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lukaku.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnNewButton_294.setBounds(0, 0, 66,23);
			lukaku.add(btnNewButton_294);
						
			JList list_91 = new JList(mu7);
			list_91.setBackground(SystemColor.inactiveCaption);
			list_91.setFont(f1);
			list_91.setBounds(67, 34, 350,100);
			lukaku.add(list_91);

			JButton btnNewButton_295 = new JButton();
			btnNewButton_295.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_295.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mata.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnNewButton_295.setBounds(0, 0, 20,20);
			mata.add(btnNewButton_295);
						
			JList list_92 = new JList(mu6);
			list_92.setBackground(SystemColor.inactiveCaption);
			list_92.setFont(f1);
			list_92.setBounds(67, 34, 350,100);
			mata.add(list_92);

			JButton btnNewButton_296 = new JButton();
			btnNewButton_296.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_296.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fellani.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnNewButton_296.setBounds(0, 0, 20,20);
			fellani.add(btnNewButton_296);
						
			JList list_93 = new JList(mu9);
			list_93.setBackground(SystemColor.inactiveCaption);
			list_93.setFont(f1);
			list_93.setBounds(67, 34, 350,100);
			fellani.add(list_93);

			JButton btnNewButton_297 = new JButton();
			btnNewButton_297.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_297.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					philjones.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnNewButton_297.setBounds(0, 0, 30,30);
			philjones.add(btnNewButton_297);
						
			JList list_94 = new JList(mu10);
			list_94.setFont(f1);
			list_94.setBounds(67, 34, 350,100);
			philjones.add(list_94);
			
			JButton btnNewButton_298 = new JButton();
			btnNewButton_298.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_298.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pogba.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnNewButton_298.setBounds(0, 0, 30,30);
			pogba.add(btnNewButton_298);
						
			JList list_95 = new JList(mu11);
			list_95.setBackground(SystemColor.inactiveCaption);
			list_95.setFont(f1);
			list_95.setBounds(67, 34, 350,100);
			pogba.add(list_95);

			JButton btnNewButton_299 = new JButton();
			btnNewButton_299.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnNewButton_299.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					carrick.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnNewButton_299.setBounds(0, 0, 30,30);
			carrick.add(btnNewButton_299);
						
			JList list_96 = new JList(mu9);
			list_96.setBackground(SystemColor.inactiveCaption);
			list_96.setFont(f1);
			list_96.setBounds(67, 34, 350,100);
			carrick.add(list_96);

			JButton btnewButton_300 = new JButton();
			btnewButton_300.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnewButton_300.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				    baily.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnewButton_300.setBounds(0, 0, 30,30);
			baily.add(btnewButton_300);
						
			JList list_97 = new JList(mu4);
			list_97.setBackground(SystemColor.inactiveCaption);
			list_97.setFont(f1);
			list_97.setBounds(67, 34, 350,100);
			baily.add(list_97);

			JButton btnewButton_301 = new JButton();
			btnewButton_301.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/backk.png")));
			btnewButton_301.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					carrick.setVisible(false);
					ManchesterUtd.setVisible(true);
				}
			});
			btnewButton_301.setBounds(0, 0,30,30);
			lukeshaw.add(btnewButton_301);
						
			JList list_98 = new JList();
			list_98.setBackground(SystemColor.inactiveCaption);
			list_98.setFont(f1);
			list_98.setBounds(67, 34, 350,100);
			lukeshaw.add(list_98);
			
			JLabel lblNewLabel_141 = new JLabel();
			lblNewLabel_141.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/tot/eric.jpg")));
			lblNewLabel_141.setBounds(467, 53, 120,100);
			eric.add(lblNewLabel_141);
			JLabel lblNewLabel_142 = new JLabel();
			lblNewLabel_142.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/tot/harry.jpg")));
			lblNewLabel_142.setBounds(467, 53, 120,100);
			harry.add(lblNewLabel_142);
			JLabel lblNewLabel_143 = new JLabel();
			lblNewLabel_143.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/tot/juan.jpg")));
			lblNewLabel_143.setBounds(467, 53, 120,100);
			juan.add(lblNewLabel_143);
			JLabel lblNewLabel_144 = new JLabel();
			lblNewLabel_144.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/tot/kazaia.jpg")));
			lblNewLabel_144.setBounds(467, 53, 120,100);
			kazaia.add(lblNewLabel_144);
			JLabel lblNewLabel_145 = new JLabel();
			lblNewLabel_145.setIcon(new ImageIcon(LIS.class.getResource("/IMAGE/tot/liorente.jpg")));
			lblNewLabel_145.setBounds(467, 53, 120,100);
			liorente.add(lblNewLabel_145);
			
			   tb1 = new JTextField();
			    tb1.setHorizontalAlignment(JTextField.CENTER);
			    tb1.setFont(f);
				tb1.setBounds(0, 35, 177, 35);
				panel_2.add(tb1);
				tb1.setColumns(10);
				
				bw1 = new JButton("search");
				bw1.setFont(f);
				bw1.setBackground(Color.DARK_GRAY);
				bw1.setForeground(Color.black);
				bw1.setVisible(true);
				bw1.setBounds(30, 90, 120, 30);
				panel_2.add(bw1);
				
				bw2 = new JButton("BACK");
				bw2.setFont(f);
				bw2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					     panel_1.setVisible(true);
					     panel_2.setVisible(false);
					}
			    });
				bw2.setBackground(Color.red);
				bw2.setForeground(Color.black);
				bw2.setVisible(true);
				bw2.setBounds(0,0, 120, 30);
				panel_2.add(bw2);
	}
}
