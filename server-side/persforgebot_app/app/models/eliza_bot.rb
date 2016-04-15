#require 'json'
require 'active_support/core_ext/hash'

class ElizaBot
	include HTTParty	

	format :json

	def self.get_chat_response (message)

		xml_output = get("http://www.botlibre.com/rest/botlibre/form-chat", query: {
				"application" => "2029128099524987566",
				"instance" => 857180,  				#bot instance 857180 means Eliza Bot
				"message" => message
				})

		json_output = Hash.from_xml(xml_output.body).to_json	

		return json_output
	end

end	


# A bot modeled after the 1966 ELIZA chatbot.
# ELIZA was written at MIT by Joseph Weizenbaum between 1964 and 1966.
# She attempts to simulate a Rogerian psychotherapist.
