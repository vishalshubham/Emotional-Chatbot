
class ProgramOBot
	include HTTParty	

	format :json

	def self.get_chat_response (message, conv_id="exampleusage_1231232")
		

		get("http://api.program-o.com/v2/chatbot/", query: {
				"bot_id" => 6,
				"say" => message,
				"convo_id" => conv_id,
				"format" => "json" 
				})
	end

end	

