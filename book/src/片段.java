

public class 片段 {
	addWindowListener(new WindowAdapter(){
				   @Override
				   public void windowClosing(WindowEvent e) {
				     int   option=   JOptionPane.showConfirmDialog( 
				                  dfa.this, "确定退出系统? ", "提示 ",JOptionPane.YES_NO_CANCEL_OPTION); 
				      if(option==JOptionPane.YES_OPTION) 
				         if(e.getWindow()   ==   dfa.this) 
				         { 
				         System.exit(0); 
				         } 
				         else 
				         { 
				         return; 
				         
				         } 
				   }
				  });
				  
				 }
}