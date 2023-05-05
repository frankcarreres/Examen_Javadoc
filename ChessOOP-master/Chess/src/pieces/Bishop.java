package pieces;

import java.util.ArrayList;

import chess.Cell;


/**
* Esta clase representa a la pieza del Alfil.
* 
* @author Frank
* @version 05/05/2023
*/

public class Bishop extends Piece{
	
    /**
     * - Constructor del alfil.
     * @param i --> Representa el ID de la pieza.
     * @param p --> Representa la ruta del archivo donde esta la pieza de la imagen.
     * @param c --> Representa el color de la pieza.
     */
        
	//Constructor
	public Bishop(String i,String p,int c)
	{
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	
        /**
         * - Este método calcula todos los movimientos posibles de un alfil en un tablero de ajedrez.
         * @param state --> El estado actual del tablero de ajedrez.       
         * @param x --> La coordenada x del alfil.
         * @param y --> La coordenada y del alfil.
         * @return --> Una ArrayList de las posibles coordenadas del Alfil.
         */
        
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		//Bishop can Move diagonally in all 4 direction (NW,NE,SW,SE)
		//This function defines that logic
		possiblemoves.clear();
		int tempx=x+1,tempy=y-1;
		while(tempx<8&&tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
			{
				possiblemoves.add(state[tempx][tempy]);
			}
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy--;
		}
		tempx=x-1;tempy=y+1;
		while(tempx>=0&&tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy++;
		}
		tempx=x-1;tempy=y-1;
		while(tempx>=0&&tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy--;
		}
		tempx=x+1;tempy=y+1;
		while(tempx<8&&tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy++;
		}
		return possiblemoves;
	}
}