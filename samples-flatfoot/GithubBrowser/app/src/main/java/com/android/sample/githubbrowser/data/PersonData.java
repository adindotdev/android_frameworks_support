/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.sample.githubbrowser.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.android.support.room.Entity;
import com.android.support.room.PrimaryKey;

/**
 * Person data object.
 */
@Entity
public class PersonData implements Parcelable {
    @PrimaryKey public String login;
    public String id;
    public String avatar_url;
    public String repos_url;
    public String name;
    public String company;
    public String blog;
    public String location;
    public String email;
    public int public_repos;
    public int followers;
    public int following;
    public String created_at;

    public PersonData() {
    }

    public PersonData(PersonData copyFrom) {
        this.login = copyFrom.login;
        this.id = copyFrom.id;
        this.avatar_url = copyFrom.avatar_url;
        this.repos_url = copyFrom.repos_url;
        this.name = copyFrom.name;
        this.company = copyFrom.company;
        this.blog = copyFrom.blog;
        this.location = copyFrom.location;
        this.email = copyFrom.email;
        this.public_repos = copyFrom.public_repos;
        this.followers = copyFrom.followers;
        this.following = copyFrom.following;
        this.created_at = copyFrom.created_at;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(login);
        out.writeString(id);
        out.writeString(avatar_url);
        out.writeString(repos_url);
        out.writeString(name);
        out.writeString(company);
        out.writeString(blog);
        out.writeString(location);
        out.writeString(email);
        out.writeInt(public_repos);
        out.writeInt(followers);
        out.writeInt(following);
        out.writeString(created_at);
    }

    public static final Creator<PersonData> CREATOR = new Creator<PersonData>() {
        public PersonData createFromParcel(Parcel in) {
            return new PersonData(in);
        }

        public PersonData[] newArray(int size) {
            return new PersonData[size];
        }
    };

    protected PersonData(Parcel in) {
        login = in.readString();
        id = in.readString();
        avatar_url = in.readString();
        repos_url = in.readString();
        name = in.readString();
        company = in.readString();
        blog = in.readString();
        location = in.readString();
        email = in.readString();
        public_repos = in.readInt();
        followers = in.readInt();
        following = in.readInt();
        created_at = in.readString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonData that = (PersonData) o;

        if (public_repos != that.public_repos) return false;
        if (followers != that.followers) return false;
        if (following != that.following) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (avatar_url != null ? !avatar_url.equals(that.avatar_url) : that.avatar_url != null) {
            return false;
        }
        if (repos_url != null ? !repos_url.equals(that.repos_url) : that.repos_url != null) {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (company != null ? !company.equals(that.company) : that.company != null) return false;
        if (blog != null ? !blog.equals(that.blog) : that.blog != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) {
            return false;
        }
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return created_at != null ? created_at.equals(that.created_at) : that.created_at == null;

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (avatar_url != null ? avatar_url.hashCode() : 0);
        result = 31 * result + (repos_url != null ? repos_url.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (blog != null ? blog.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + public_repos;
        result = 31 * result + followers;
        result = 31 * result + following;
        result = 31 * result + (created_at != null ? created_at.hashCode() : 0);
        return result;
    }
}
