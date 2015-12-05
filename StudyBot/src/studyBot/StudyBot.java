package studyBot;

import telegramBotAPI.*;

public class StudyBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  You need to create a Apikey class with a String attribute
		 *  call apiKey and a method getApiKey()
		 */
		ApiKey botKey = new ApiKey();
		TelegramBot bot = new TelegramBot(botKey.getApiKey());
		while(!bot.throwMessages()){}
		TelegramMsg msg;
		while(true){
			while((msg = bot.nextMsg(10)) == null){}
			while(!bot.sendText("Hi, my name is @StudyBot! I'm working to "
					+ "improve my skills in order to enrich your student group "
					+ "chat more. Have you got any idea about what I could do? "
					+ "Send it to @jorgesanz. He will be thankful! :-)",
					msg.getChat())){}
		}
	}
}
