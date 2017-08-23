export class JokeService {
	
	jokes = ['Fridays are very boring.','Mondays are always welcome.','Wednesdays are amazing.','Thursdays are ok ok.'];	

	nextJoke():string{
		console.log("Inside JokeService.nextJoke()");
		let idx = Math.floor(Math.random()*this.jokes.length);
		return this.jokes[idx];
	}		
}
