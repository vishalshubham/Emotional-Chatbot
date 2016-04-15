#require 'json'
require 'active_support/core_ext/hash'

class AliceBot
	include HTTParty	

	format :json

	def self.get_chat_response (message)

		xml_output = get("http://www.botlibre.com/rest/botlibre/form-chat", query: {
				"application" => "2029128099524987566",
				"instance" => 20873,  				#bot instance 20873 means Alice Bot
				"message" => message
				})

		json_output = Hash.from_xml(xml_output.body).to_json	

		return json_output
	end

end	

