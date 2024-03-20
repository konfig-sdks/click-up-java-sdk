package com.konfigthis.client;

import com.konfigthis.client.api.AttachmentsApi;
import com.konfigthis.client.api.AuthorizationApi;
import com.konfigthis.client.api.CommentsApi;
import com.konfigthis.client.api.CustomFieldsApi;
import com.konfigthis.client.api.CustomTaskTypesApi;
import com.konfigthis.client.api.FoldersApi;
import com.konfigthis.client.api.GoalsApi;
import com.konfigthis.client.api.GuestsApi;
import com.konfigthis.client.api.ListsApi;
import com.konfigthis.client.api.MembersApi;
import com.konfigthis.client.api.RolesApi;
import com.konfigthis.client.api.SharedHierarchyApi;
import com.konfigthis.client.api.SpacesApi;
import com.konfigthis.client.api.TagsApi;
import com.konfigthis.client.api.TaskChecklistsApi;
import com.konfigthis.client.api.TaskRelationshipsApi;
import com.konfigthis.client.api.TaskTemplatesApi;
import com.konfigthis.client.api.TasksApi;
import com.konfigthis.client.api.TeamsUserGroupsApi;
import com.konfigthis.client.api.TeamsWorkspacesApi;
import com.konfigthis.client.api.TimeTrackingApi;
import com.konfigthis.client.api.TimeTrackingLegacyApi;
import com.konfigthis.client.api.UsersApi;
import com.konfigthis.client.api.ViewsApi;
import com.konfigthis.client.api.WebhooksApi;

public class ClickUp {
    private ApiClient apiClient;
    public final AttachmentsApi attachments;
    public final AuthorizationApi authorization;
    public final CommentsApi comments;
    public final CustomFieldsApi customFields;
    public final CustomTaskTypesApi customTaskTypes;
    public final FoldersApi folders;
    public final GoalsApi goals;
    public final GuestsApi guests;
    public final ListsApi lists;
    public final MembersApi members;
    public final RolesApi roles;
    public final SharedHierarchyApi sharedHierarchy;
    public final SpacesApi spaces;
    public final TagsApi tags;
    public final TaskChecklistsApi taskChecklists;
    public final TaskRelationshipsApi taskRelationships;
    public final TaskTemplatesApi taskTemplates;
    public final TasksApi tasks;
    public final TeamsUserGroupsApi teamsUserGroups;
    public final TeamsWorkspacesApi teamsWorkspaces;
    public final TimeTrackingApi timeTracking;
    public final TimeTrackingLegacyApi timeTrackingLegacy;
    public final UsersApi users;
    public final ViewsApi views;
    public final WebhooksApi webhooks;

    public ClickUp() {
        this(null);
    }

    public ClickUp(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.attachments = new AttachmentsApi(this.apiClient);
        this.authorization = new AuthorizationApi(this.apiClient);
        this.comments = new CommentsApi(this.apiClient);
        this.customFields = new CustomFieldsApi(this.apiClient);
        this.customTaskTypes = new CustomTaskTypesApi(this.apiClient);
        this.folders = new FoldersApi(this.apiClient);
        this.goals = new GoalsApi(this.apiClient);
        this.guests = new GuestsApi(this.apiClient);
        this.lists = new ListsApi(this.apiClient);
        this.members = new MembersApi(this.apiClient);
        this.roles = new RolesApi(this.apiClient);
        this.sharedHierarchy = new SharedHierarchyApi(this.apiClient);
        this.spaces = new SpacesApi(this.apiClient);
        this.tags = new TagsApi(this.apiClient);
        this.taskChecklists = new TaskChecklistsApi(this.apiClient);
        this.taskRelationships = new TaskRelationshipsApi(this.apiClient);
        this.taskTemplates = new TaskTemplatesApi(this.apiClient);
        this.tasks = new TasksApi(this.apiClient);
        this.teamsUserGroups = new TeamsUserGroupsApi(this.apiClient);
        this.teamsWorkspaces = new TeamsWorkspacesApi(this.apiClient);
        this.timeTracking = new TimeTrackingApi(this.apiClient);
        this.timeTrackingLegacy = new TimeTrackingLegacyApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
        this.views = new ViewsApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}
