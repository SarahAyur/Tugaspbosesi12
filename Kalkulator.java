Tugas  sesi12 ;

impor  javax . ayunan .*;
impor  jawa . awt .*;

public  class  Kalkulator  extends  JFrame {
    
    JTextField  txt = JTextField baru  ( 50 );

    JButton  b1 = JButton baru  ( "1" );
    JButton  b2 = JButton baru  ( "2" );
    JButton  b3 = JButton baru  ( "3" );
    JButton  b4 = JButton baru  ( "4" );
    JButton  b5 = JButton baru  ( "5" );
    JButton  b6 = JButton baru  ( "6" );
    JButton  b7 = JButton baru  ( "7" );
    JButton  b8 = JButton baru  ( "8" );
    JButton  b9 = JButton baru  ( "9" );
    JButton  b0 = JButton baru  ( "0" );
    JButton  bEqual = JButton baru  ( "=" );
    JButton  bPlus = JButton baru  ( "+" );
    JButton  bMinus = JButton baru  ( "-" );
    JButton  bMultiply = new  JButton ( "*" );
    JButton  bDivide = new  JButton ( "/" );
    JButton  bPercent = JButton baru  ( "%" );
    JButton  bModulo = JButton baru  ( "Mod" );
    JButton  bExit = JButton baru  ( "Keluar" );
    

    Kalkulator ( int  sizex , int  sizey ){
        super ( "Kalkulator Ilmiah" );
        setSize ( sizex , sizey );
        setDefaultCloseOperation ( EXIT_ON_CLOSE );
        setVisible ( benar );
        getContentPane (). setBackground ( Color.BLUE ) ; _
        setLocationRelativeTo ( null );

        FlowLayout  fl = FlowLayout baru  ();
         Panel masukan JPanel = JPanel baru  ();
        panel masukan . setLayout ( fl );
        panel masukan . tambahkan ( txt );
        tambahkan ( inputpanel , BorderLayout.NORTH ) ; _

        GridLayout  gl = GridLayout baru  ( 3 , 5 );
         panel tombol JPanel = JPanel baru  ();
        panel tombol . setLayout ( gl );

        panel tombol . tambahkan ( b1 );
        panel tombol . tambahkan ( b2 );
        panel tombol . tambahkan ( b3 );
        panel tombol . tambahkan ( b4 );
        panel tombol . tambahkan ( b5 );
        panel tombol . tambahkan ( b6 );
        panel tombol . tambahkan ( b7 );
        panel tombol . tambahkan ( b8 );
        panel tombol . tambahkan ( b9 );
        panel tombol . tambahkan ( b0 );
        panel tombol . tambahkan ( bSama );
        panel tombol . tambahkan ( bPlus );
        panel tombol . tambahkan ( bMinus );
        panel tombol . tambahkan ( bKalikan );
        panel tombol . tambahkan ( bBagikan );
        panel tombol . tambahkan ( bPersen );
        panel tombol . tambahkan ( bModulo );
        panel tombol . tambahkan ( bKeluar );

        
        tambahkan ( panel tombol , BorderLayout.CENTER ) ;
        
    }

    public  static  void  main ( String [] args ) {
        Kalkulator  kal = Kalkulator baru  ( 350 , 250 );
    }
}
