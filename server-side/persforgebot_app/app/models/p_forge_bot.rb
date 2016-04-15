require_relative 'ticket'

class PForgeBot
	include HTTParty	

	format :json

	def self.get_chat_response (message, fname="Charles", lname="Fernendes")
		akey = Ticket.get_api_key			
		
		message_str="{\"message\":{\"message\":\"" + message + "\"," +
						"\"chatBotID\":6," +
						"\"timestamp\":" + DateTime.now.strftime('%s') + "}," +
   						"\"user\":{\"firstName\":\"" + fname + "\"," +
   								 "\"lastName\":\""+ lname + "\"," +
   								 "\"gender\":\"m\"," +
   								 "\"externalID\":\"abc-639184572\"}}"

		#puts "=============++++++++++++++==================="
   		#json_message = JSON.parse(message_str)
   		#puts json_message
   		#puts "=============++++++++++++++==================="
   	
		hash = Ticket.get_hash(message_str)
	
		#puts hash
		#puts "=============++++++++++++++==================="

		get("http://www.personalityforge.com/api/chat/", query: {
				"apiKey" => akey,
				"hash" => hash,
				"message" => message_str
				})
	end

end	

