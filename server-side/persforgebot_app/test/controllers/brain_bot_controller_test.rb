require 'test_helper'

class BrainBotControllerTest < ActionController::TestCase
  test "should get get_response" do
    get :get_response
    assert_response :success
  end

end
