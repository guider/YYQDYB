package com.yanyuanquan.android.yyqdyb.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * @Created by apple on 15/12/25.
 * @description:
 * @projectName:YYQDYB
 */
public class JokeWithImg implements Parcelable {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body :
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * allNum : 20128
     * allPages : 1007
     * contentlist :
     * currentPage : 1
     * maxResult : 20
     * ret_code : 0
     */

    private ShowapiResBodyEntity showapi_res_body;

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public void setShowapi_res_body(ShowapiResBodyEntity showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    @Override
    public String toString() {
        return "JokeWithImg{" +
                "showapi_res_code=" + showapi_res_code +
                ", showapi_res_error='" + showapi_res_error + '\'' +
                ", showapi_res_body=" + showapi_res_body +
                '}';
    }

    public ShowapiResBodyEntity getShowapi_res_body() {
        return showapi_res_body;
    }

    public static class ShowapiResBodyEntity implements Parcelable {
        private int allNum;
        private int allPages;
        private int currentPage;
        private int maxResult;
        private int ret_code;
        /**
         * ct : 2015-12-25 17:00:29.355
         * img : http://img0.hao123.com/data/3_1565f321301089921e4beb5ca4e7b79b_0
         * title : 妹子，这马骑得应该很满意吧
         * type : 2
         */

        private List<ContentlistEntity> contentlist;

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public void setContentlist(List<ContentlistEntity> contentlist) {
            this.contentlist = contentlist;
        }

        public int getAllNum() {
            return allNum;
        }

        @Override
        public String toString() {
            return "ShowapiResBodyEntity{" +
                    "allNum=" + allNum +
                    ", allPages=" + allPages +
                    ", currentPage=" + currentPage +
                    ", maxResult=" + maxResult +
                    ", ret_code=" + ret_code +
                    ", contentlist=" + contentlist +
                    '}';
        }

        public int getAllPages() {
            return allPages;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public int getRet_code() {
            return ret_code;
        }

        public List<ContentlistEntity> getContentlist() {
            return contentlist;
        }

        public static class ContentlistEntity implements Parcelable {
            private String ct;
            private String img;
            private String title;

            @Override
            public String toString() {
                return "ContentlistEntity{" +
                        "ct='" + ct + '\'' +
                        ", img='" + img + '\'' +
                        ", title='" + title + '\'' +
                        ", type=" + type +
                        '}';
            }

            private int type;

            public void setCt(String ct) {
                this.ct = ct;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getCt() {
                return ct;
            }

            public String getImg() {
                return img;
            }

            public String getTitle() {
                return title;
            }

            public int getType() {
                return type;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.ct);
                dest.writeString(this.img);
                dest.writeString(this.title);
                dest.writeInt(this.type);
            }

            public ContentlistEntity() {
            }

            protected ContentlistEntity(Parcel in) {
                this.ct = in.readString();
                this.img = in.readString();
                this.title = in.readString();
                this.type = in.readInt();
            }

            public static final Parcelable.Creator<ContentlistEntity> CREATOR = new Parcelable.Creator<ContentlistEntity>() {
                public ContentlistEntity createFromParcel(Parcel source) {
                    return new ContentlistEntity(source);
                }

                public ContentlistEntity[] newArray(int size) {
                    return new ContentlistEntity[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.allNum);
            dest.writeInt(this.allPages);
            dest.writeInt(this.currentPage);
            dest.writeInt(this.maxResult);
            dest.writeInt(this.ret_code);
            dest.writeTypedList(contentlist);
        }

        public ShowapiResBodyEntity() {
        }

        protected ShowapiResBodyEntity(Parcel in) {
            this.allNum = in.readInt();
            this.allPages = in.readInt();
            this.currentPage = in.readInt();
            this.maxResult = in.readInt();
            this.ret_code = in.readInt();
            this.contentlist = in.createTypedArrayList(ContentlistEntity.CREATOR);
        }

        public static final Parcelable.Creator<ShowapiResBodyEntity> CREATOR = new Parcelable.Creator<ShowapiResBodyEntity>() {
            public ShowapiResBodyEntity createFromParcel(Parcel source) {
                return new ShowapiResBodyEntity(source);
            }

            public ShowapiResBodyEntity[] newArray(int size) {
                return new ShowapiResBodyEntity[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.showapi_res_code);
        dest.writeString(this.showapi_res_error);
        dest.writeParcelable(this.showapi_res_body, 0);
    }

    public JokeWithImg() {
    }

    protected JokeWithImg(Parcel in) {
        this.showapi_res_code = in.readInt();
        this.showapi_res_error = in.readString();
        this.showapi_res_body = in.readParcelable(ShowapiResBodyEntity.class.getClassLoader());
    }

    public static final Parcelable.Creator<JokeWithImg> CREATOR = new Parcelable.Creator<JokeWithImg>() {
        public JokeWithImg createFromParcel(Parcel source) {
            return new JokeWithImg(source);
        }

        public JokeWithImg[] newArray(int size) {
            return new JokeWithImg[size];
        }
    };
}
