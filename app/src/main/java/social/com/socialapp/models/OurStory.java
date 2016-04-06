
package social.com.socialapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OurStory {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("location_url")
    @Expose
    private String locationUrl;
    @SerializedName("more_images")
    @Expose
    private String moreImages;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The content
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 
     * @return
     *     The locationUrl
     */
    public String getLocationUrl() {
        return locationUrl;
    }

    /**
     * 
     * @param locationUrl
     *     The location_url
     */
    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }

    /**
     * 
     * @return
     *     The moreImages
     */
    public String getMoreImages() {
        return moreImages;
    }

    /**
     * 
     * @param moreImages
     *     The more_images
     */
    public void setMoreImages(String moreImages) {
        this.moreImages = moreImages;
    }

}
