module.exports={
	greet:function(name,success,error){
		cordova.exec(success,error,"Hello","greet",[name]);
	}
}