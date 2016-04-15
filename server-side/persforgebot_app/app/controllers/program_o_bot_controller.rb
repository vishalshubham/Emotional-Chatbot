class ProgramOBotController < ApplicationController
  def get_response

	conv_id = params[:convo_id]
	
	if conv_id.present? then
		@response = ProgramOBot.get_chat_response(
                                        params[:message],
					conv_id)
	else
		@response = ProgramOBot.get_chat_response(
                	                params[:message])
	end

        render :json => @response
  end
end
