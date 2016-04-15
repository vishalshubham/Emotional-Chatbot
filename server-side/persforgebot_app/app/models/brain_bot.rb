#require 'json'
require 'active_support/core_ext/hash'

class BrainBot
	include HTTParty	

	format :json

	def self.get_chat_response (message)

		xml_output = get("http://www.botlibre.com/rest/botlibre/form-chat", query: {
				"application" => "2029128099524987566",
				"instance" => 165,  				#bot instance 165 means Brain Bot
				"message" => message
				})

		json_output = Hash.from_xml(xml_output.body).to_json	

		return json_output
	end

end	

