class AliceBotController < ApplicationController
  def get_response

	@response = AliceBot.get_chat_response(
                	                params[:message])

        render :json => @response	
  end
end
