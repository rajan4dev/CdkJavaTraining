class AlarmDemo {
		
	public static void main(String[] args){

		AlarmService.start("House is burning, wake up",(String msg)-> { 
			System.out.printf("Morning Alarm : %s%n",msg); 
		});

		AlarmService.start("Burn your neighbaur House, wake up",(String msg)-> { 
			System.out.printf("Night Alarm : %s%n",msg); 
		});

		AlarmService.start("Jagteeeee rahooooooo",(String msg)-> { 
			System.out.printf("Noon Alarm : %s%n",msg); 
		});

	}

}