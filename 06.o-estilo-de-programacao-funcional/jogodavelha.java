import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		comecaJogo(0 , 0);
	}
    	private static void comecaJogo(int pontuacaoJogador1, int pontuacaoJogador2) {
                System.out.println("Faça sua escolha: \n(1) jogar\n(2) Ver pontuação dos jogadores\n(3) Sair do jogo");
        	Scanner sc = new Scanner(System.in);
        	int escolha = sc.nextInt();
       	 	switch (escolha){
	            case 1:
		         char[][] board = inicializa();
			 print_board(board);
			 char ganhador = joga(board, 'X');
			 if (ganhador == 'X') pontuacaoJogador1++; else if(ganhador == 'O') pontuacaoJogador2++;
			 comecaJogo(pontuacaoJogador1, pontuacaoJogador2);
		         break;
	            case 2:
	                mostraPontuacao(pontuacaoJogador1, pontuacaoJogador2);
                        comecaJogo(pontuacaoJogador1,pontuacaoJogador2);
                        break;
                    case 3:
                        System.out.println("Espero você de volta");
		}
	}
	private static void mostraPontuacao(int pontuacaoJogador1, int pontuacaoJogador2) {
		System.out.println("Pontuação do jogador 1 é de "+pontuacaoJogador1);
		System.out.println("Pontuação do jogador 2 é de "+pontuacaoJogador2);
	}
        private static char joga(char[][] board, char vezPlayer) {
	    	System.out.println("Vez de " + vezPlayer + " faça sua jogada");
		char[][] novoBoard = marcaPonto(board, vezPlayer);
		print_board(novoBoard);
		if(verificaVitoria(novoBoard)) {
			System.out.println("O player " + vezPlayer + " ganhou!!");
			return vezPlayer;
		}
		else if(verificaEmpate(novoBoard)) {
			System.out.println("Deu empate :p");
			return '_';
		}
		else {
			vezPlayer = (vezPlayer == 'X') ? 'O' : 'X';
			return joga(novoBoard, vezPlayer);
		}
	}
	private static char[][] marcaPonto(char[][] board, char vezPlayer) {
		char[][] novoBoard = repassaPontos(board);
		novoBoard = marcaPontoAux(novoBoard,vezPlayer);
		return novoBoard;
	}
	private static char[][] repassaPontos(char[][] board) {
		char[][] novoBoard = inicializa();
		for(int i = 0 ; i<3 ; i++)
			for(int j = 0 ; j<3 ; j++)
				novoBoard[i][j] = board[i][j];
		return novoBoard;
	}
	private static char[][] marcaPontoAux(char[][]board,char vezPlayer) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha a linha (1-3)");
		int linha = sc.nextInt() - 1;
		System.out.println("Escolha a coluna (1-3)");
		int coluna = sc.nextInt() -1;
		if (linha>=0 && 2>=linha && coluna>=0 && 2>=coluna && board[linha][coluna] ==' ') {
			board[linha][coluna] = vezPlayer;
			return board;
		}
		else {
			System.out.println("Jogada invalida favor repita ela");
			return marcaPonto(board, vezPlayer);
		}
	}
	private static void print_board(char[][] board) {
		for(int i = 0 ; i<3 ; i++) {
			System.out.println("| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " | ");
			System.out.println("|---|---|---|");
		}
	}
    	private static char[][] inicializa() {
    		char[][] board = new char[3][3];
		for(int i = 0 ; i<3 ; i++)
			for(int j = 0 ; j<3 ; j++)
				board[i][j] = ' ';
		return board;
	}
    	private static boolean verificaVitoria(char[][]board) {
    		for(int i = 0 ; i<3 ; i++) {
    			if(board[i][0]==board[i][1] && board[i][0]==board[i][2] && board[i][0]!=' ')
				return true;
    			if(board[0][i]==board[1][i] && board[0][i]==board[2][i] && board[0][i]!=' ')
				return true;
		}
		if((board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[0][0]!=' ') || (board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[0][2]!=' '))
			return true;
		return false;
	}
	private static boolean verificaEmpate(char[][]board) {
        	for(int i = 0 ; i<3 ; i++)
			for(int j = 0 ; j<3 ; j++)
				if(board[i][j] == ' ')
		    			return false;
		return true;
    }	
}
