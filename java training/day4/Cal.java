enum Cal{

	SUM{
		void calculate(int valOne,int valTwo){
			System.out.println("SUM : "+(valOne+valTwo));
		}
	},
	DIFF{
		void calculate(int valOne,int valTwo){
			System.out.println("DIFF : "+(valOne-valTwo));
		}
	},
	MULTIPLY{
		void calculate(int valOne,int valTwo){
			System.out.println("MULTIPLY : "+(valOne*valTwo));
		}
	},
	DIVIDE{
		void calculate(int valOne,int valTwo){
			System.out.println("DIVIDE : "+(valOne/valTwo));
		}
	};

	abstract void calculate(int valOne,int valTwo);
}

class CalDemo{

	public static void main(String[] s){
		Cal.SUM.calculate(10,5);
		Cal.DIFF.calculate(10,5);
		Cal.MULTIPLY.calculate(10,5);
		Cal.DIVIDE.calculate(10,5);
	}
}

