class ElizaBotController < ApplicationController
  def get_response
	@response = ElizaBot.get_chat_response(
                                        params[:message])

        render :json => @response	
  end
end
