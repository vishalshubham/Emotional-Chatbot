require 'openssl'
require "base64"


class Ticket
	
	def self.get_hash(message)
        #hash = OpenSSL::HMAC.digest('sha256', get_api_secret, message)
		#return Base64.encode64(hash) 
		#hash = Base64.encode64(OpenSSL::HMAC.digest(OpenSSL::Digest.new('sha256'), get_api_secret, message)).strip()
		#hash = Base64.encode64(OpenSSL::HMAC.hexdigest(OpenSSL::Digest.new('sha256'), get_api_secret, message)).strip()
		hash = OpenSSL::HMAC.hexdigest(OpenSSL::Digest.new('sha256'), get_api_secret, message)
		return hash 
	end	

	def self.get_api_key
		akey =  'xgKeEBG2a5u1XBrw'
		return akey
	end

	def self.get_api_secret
		sec = 'pw57b2xtMATXPmDYFLlnLQS7QTkftDCv' 
		return sec
	end
end
