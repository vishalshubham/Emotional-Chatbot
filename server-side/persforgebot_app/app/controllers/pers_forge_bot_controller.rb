class PersForgeBotController < ApplicationController
  def get_response
	fname = params[:fname]
	lname = params[:lname]
	
	if fname.present? and lname.present? then
		@response = PForgeBot.get_chat_response(
                                        params[:message],
					fname,
					lname)
	else
		@response = PForgeBot.get_chat_response(
                	                params[:message])
	end

        render :json => @response	
  end
end
