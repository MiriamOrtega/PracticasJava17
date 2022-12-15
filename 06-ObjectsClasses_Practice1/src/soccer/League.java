/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soccer;

/**
 *
 * @author Miriam
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Team team1 = new Team();
        
        Player player1R = new Player();
        Player player2R = new Player();
        Player player3R = new Player();
        
        Game juego1 = new Game();
        
        player1R.playerName = "Ramon";
        player2R.playerName = "Renata";
        player3R.playerName = "Rogelio";
        
        
        Player [] thePlayers_R = { player1R, player2R, player3R };
      
        team1.teamName = "Los Rojos";
        team1.playerArray = thePlayers_R;
        
        //player1R.playerName = "Robert Service";
        System.out.println( team1.teamName);
        for( Player thePlayer : team1.playerArray ){
            System.out.println(thePlayer.playerName);
        }
        
        Team team2 = new Team();
        team2.teamName = "Los Azules";
        
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Antonio";
        
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Alicia";
        
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Andrés";
        
        
        System.out.println( team2.teamName);
        for( Player thePlayer : team2.playerArray ){
            System.out.println(thePlayer.playerName);
        }
        
        
    }
    
}
