
package social.com.socialapp.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SocialData {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("contact_url")
    @Expose
    private String contactUrl;
    @SerializedName("our_story")
    @Expose
    private List<OurStory> ourStory = new ArrayList<OurStory>();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 
     * @param photo
     *     The photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * 
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The contactUrl
     */
    public String getContactUrl() {
        return contactUrl;
    }

    /**
     * 
     * @param contactUrl
     *     The contact_url
     */
    public void setContactUrl(String contactUrl) {
        this.contactUrl = contactUrl;
    }

    /**
     * 
     * @return
     *     The ourStory
     */
    public List<OurStory> getOurStory() {
        return ourStory;
    }

    /**
     * 
     * @param ourStory
     *     The our_story
     */
    public void setOurStory(List<OurStory> ourStory) {
        this.ourStory = ourStory;
    }

}
