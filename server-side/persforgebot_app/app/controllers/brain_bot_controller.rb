class BrainBotController < ApplicationController
  def get_response
	
	@response = BrainBot.get_chat_response(
                	                params[:message])

        render :json => @response	
  end
end
