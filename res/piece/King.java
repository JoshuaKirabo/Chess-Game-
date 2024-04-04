package piece;

import main.GamePanel;

public class King extends Piece
	{
		public King(int color, int col, int row) 
			{
				// TODO Auto-generated constructor stub
			
				super(color, col, row);
				
				if(color == GamePanel.WHITE)
					{
						image = getImage("/piece/w-king");
					}
				else
					{
						image = getImage("/piece/b-king");
					}
			}
	}
