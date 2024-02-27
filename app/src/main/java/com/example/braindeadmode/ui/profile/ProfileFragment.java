    package com.example.braindeadmode.ui.profile;

    import android.os.Bundle;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ImageView;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.fragment.app.Fragment;
    import androidx.lifecycle.ViewModelProvider;

    import com.example.braindeadmode.databinding.FragmentProfileBinding;

    public class ProfileFragment extends Fragment {

        private FragmentProfileBinding binding;

        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            ProfileViewModel profileViewModel =
                    new ViewModelProvider(this).get(ProfileViewModel.class);

            binding = FragmentProfileBinding.inflate(inflater, container, false);
            View root = binding.getRoot();

            // Assuming ProfileViewModel provides the profile image resource ID and username
            profileViewModel.getProfileImageResource().observe(getViewLifecycleOwner(), resourceId -> {
                binding.profileImage.setImageResource(resourceId);
            });

            profileViewModel.getUsername().observe(getViewLifecycleOwner(), username -> {
                binding.userName.setText(username);
            });

            return root;
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
    }
