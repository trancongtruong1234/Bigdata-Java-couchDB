package entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"id", "revision"})
public class instruments {
   
         @JsonProperty("_id")
        private String id;

        @JsonProperty("_rev")
        private String revision;
        
		private String reviewerID;
        private String reviewerName;
        private String reviewTime;
        private Integer unixReviewTime;
        private String summary;
        private Integer overall;
        private String reviewText;
		private ArrayList<Integer> helpful;
        private String asin;
        
        
        public ArrayList<Integer> getHelpful() {
			return helpful;
		}

		public void setHelpful(ArrayList<Integer> helpful) {
			this.helpful = helpful;
		}

        
        public String getReviewerID() {
			return reviewerID;
		}

		public void setReviewerID(String reviewerID) {
			this.reviewerID = reviewerID;
		}

		public String getReviewerName() {
			return reviewerName;
		}

		public void setReviewerName(String reviewerName) {
			this.reviewerName = reviewerName;
		}

		public String getReviewTime() {
			return reviewTime;
		}

		public void setReviewTime(String reviewTime) {
			this.reviewTime = reviewTime;
		}

		public Integer getUnixReviewTime() {
			return unixReviewTime;
		}

		public void setUnixReviewTime(Integer unixReviewTime) {
			this.unixReviewTime = unixReviewTime;
		}

		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public Integer getOverall() {
			return overall;
		}

		public void setOverall(Integer overall) {
			this.overall = overall;
		}

		public String getReviewText() {
			return reviewText;
		}

		public void setReviewText(String reviewText) {
			this.reviewText = reviewText;
		}

		public String getAsin() {
			return asin;
		}

		public void setAsin(String asin) {
			this.asin = asin;
		}

		public void setRevision(String revision) {
			this.revision = revision;
		}


        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public String getRevision() {
            return revision;
        }

}