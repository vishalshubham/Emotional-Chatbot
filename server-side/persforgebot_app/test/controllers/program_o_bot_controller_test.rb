require 'test_helper'

class ProgramOBotControllerTest < ActionController::TestCase
  test "should get get_response" do
    get :get_response
    assert_response :success
  end

end
